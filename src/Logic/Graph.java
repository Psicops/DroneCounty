package Logic;

/**
 *
 * @author †Psicops†
 */

import Launcher.DroneCounty;
import UI.CountyMap;
import java.util.*;

public class Graph {
    
    private ArrayList<Vertex> VERTICES;
    
    public Graph(String vertexNumber){
        VERTICES = new ArrayList<Vertex>(Integer.parseInt(vertexNumber));
        for(String vertix : CountyMap.SELECTED_NODES){
            VERTICES.add(new Vertex(vertix));
        }
    }
    
//    public Graph(int pNumberVertices){
//        VERTICES = new ArrayList<Vertex>(pNumberVertices);
//        for(int vertix = 0; vertix < pNumberVertices; vertix++){
//            VERTICES.add(new Vertex("V"+Integer.toString(vertix)));
//        }
//    }
    
    public void startGraph(){
        for (String node : DroneCounty.GRAPH_NODES) {
            int source = getNodePosition("" + node.charAt(0));
            int dest  = getNodePosition("" + node.charAt(1));
            int weight = Integer.parseInt(node.substring(2));
            DroneCounty.MY_GRAPH.addEdge(source, dest, weight);
        }
    }
    
    public int getNodePosition(String node){
        for(int getter = 0; getter < VERTICES.size(); getter++){
            if(VERTICES.get(getter).NAME.equals(node))
                return getter;
        }
        return 0;
    }
    
    public void addEdge(int pSource, int pDest, int pWeight){
        Vertex newVertex = VERTICES.get(pSource);
        Edge newEdge = new Edge(VERTICES.get(pDest),pWeight);
        newVertex.NEIGHBOURS.add(newEdge);
    }
	
    public ArrayList<Vertex> getVertices() {
        return VERTICES;
    }
	
    public Vertex getVertex(int pVert){
        return VERTICES.get(pVert);
    }
    
    public void calculate(Vertex pSource){
        pSource.MIN_DISTANCE = 0;
        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
        queue.add(pSource);
        while(!queue.isEmpty()){
            Vertex Vertix = queue.poll();
            for(Edge neighbour:Vertix.NEIGHBOURS){
                Double newDist = Vertix.MIN_DISTANCE+neighbour.WEIGHT;
                if(neighbour.TARGET.MIN_DISTANCE>newDist){
                    queue.remove(neighbour.TARGET);
                    neighbour.TARGET.MIN_DISTANCE = newDist;
                    neighbour.TARGET.PATH = new LinkedList<Vertex>(Vertix.PATH);
                    neighbour.TARGET.PATH.add(Vertix);
                    queue.add(neighbour.TARGET);					
                }
            }
        }
    }
    
    public void getShortestPath(String source, String dest){
        int srcVertex = getNodePosition(source);
        calculate(getVertex(srcVertex));
        for(Vertex vertix:getVertices()){
            if(vertix.NAME.equals(dest)){
                System.out.print("Destiny Vertex -> "+vertix+" , Distance -> "+ vertix.MIN_DISTANCE+" , Path -> ");
                for(Vertex pathVert:vertix.PATH) {
                    System.out.print(pathVert+" ");
                }
                System.out.println(""+vertix);
            }
        }
    }
    
    public void printMinimumDistance(){
        for(Vertex v:getVertices()){
            System.out.print("Destiny Vertex -> "+v+" , Distance -> "+ v.MIN_DISTANCE+" , Path -> ");
            for(Vertex pathVert:v.PATH) {
                System.out.print(pathVert+" ");
            }
            System.out.println(""+v);
        }
    }
    
}
