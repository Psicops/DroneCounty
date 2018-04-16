package Logic;

/**
 *
 * @author †Psicops†
 */

import Launcher.DroneCounty;
import UI.CountyMap;
import java.util.*;
import javax.swing.JOptionPane;

public class Graph {
    
    public ArrayList<Vertex> VERTICES;
    
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
        insertDrones(DroneCounty.SET_UP_PARAM[4]);
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
        newVertex.TRACK.add(new Tracks(VERTICES.get(pSource).NAME,VERTICES.get(pDest).NAME,
                DroneCounty.SET_UP_PARAM[1],DroneCounty.SET_UP_PARAM[2]));
        newVertex.NEIGHBOURS.add(newEdge);
    }
	
    public ArrayList<Vertex> getVertices() {
        return VERTICES;
    }
	
    public Vertex getVertex(int pVert){
        return VERTICES.get(pVert);
    }
    
    public void insertDrones(String number){
        for(int drones = 0; drones < Integer.parseInt(number); drones++){
            Drone newDrone = new Drone();
            String path = getRandomNodes();
            insertTrack(newDrone, path);
        }
    }
    
    public String getRandomNodes(){
        while(true){
            Random rand = new Random();
            String src = CountyMap.SELECTED_NODES[rand.nextInt(Integer.parseInt(DroneCounty.SET_UP_PARAM[3]))];
            String dest = "";
            while(true){
                String newNode = CountyMap.SELECTED_NODES[rand.nextInt(Integer.parseInt(DroneCounty.SET_UP_PARAM[3]))];
                if(!newNode.equals(src)){
                    dest = newNode;
                    break;
                }
            }
            if(checkPath(src+dest)){
                return src+dest;
            }
        }
    }
    
    public boolean checkPath(String path){
        for(String checker : DroneCounty.GRAPH_NODES){
            if(path.charAt(0) == checker.charAt(0) && path.charAt(1) == checker.charAt(1)){
               return true; 
            }
        }
        return false;
    }
    
    public void insertTrack(Drone newDrone, String path){
        for(Vertex vertex : DroneCounty.MY_GRAPH.VERTICES){
            for(Tracks track : vertex.TRACK){
                if(track.SOURCE.equals("" + path.charAt(0)) && track.DEST.equals(""+path.charAt(1))){
                    addDrone(track, newDrone);
                }
            }
        }
    }
    
    public void addDrone(Tracks track, Drone drone){
        if(track.WIDTH > drone.WIDTH){
            track.DRONES.add(drone);
            track.WIDTH -= drone.WIDTH;
        }else if(track.HEIGHT > drone.HEIGHT){
            track.DRONES.add(drone);
            track.HEIGHT -= drone.HEIGHT;
            track.WIDTH = Integer.parseInt(DroneCounty.SET_UP_PARAM[1]);
        }else{//Hay que meter los drones en una lista de espera o algo así.
            JOptionPane.showMessageDialog(null, "No room for more drones in this track.");
        }
    }
    
    public void calculateDijkstra(Vertex pSource){
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
        calculateDijkstra(getVertex(srcVertex));
        for(Vertex vertix:getVertices()){
            if(vertix.NAME.equals(dest)){
                System.out.print("Destiny Vertex -> "+vertix+" , Distance -> "+ vertix.MIN_DISTANCE+" , Path -> ");
                for(Vertex pathVert:vertix.PATH) {
                    System.out.print(pathVert+" ");
                }
                System.out.println(""+vertix);
                break;
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
