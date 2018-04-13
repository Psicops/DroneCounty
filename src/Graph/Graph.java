package Graph;

import java.util.*;

public class Graph {
    
    private ArrayList<Vertex> VERTICES;
    
    public Graph(int pNumberVertices){
        VERTICES = new ArrayList<Vertex>(pNumberVertices);
        for(int vertix = 0; vertix < pNumberVertices; vertix++){
            VERTICES.add(new Vertex("V"+Integer.toString(vertix)));
        }
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
    
    public void printMinimumDistance(){
        for(Vertex v:getVertices()){
            System.out.print("Destiny Vertex -> "+v+" , Distance -> "+ v.MIN_DISTANCE+" , Path -> ");
            for(Vertex pathvert:v.PATH) {
                System.out.print(pathvert+" ");
            }
            System.out.println(""+v);
        }
    }
    
}
