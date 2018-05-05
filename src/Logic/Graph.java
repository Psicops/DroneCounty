package Logic;

/**
 *
 * @author †Psicops†
 */

import static Logic.FlightControl.SELECTED_NODES;
import java.util.*;
import javax.swing.JOptionPane;

public class Graph {
    
    public ArrayList<Vertex> VERTICES;
    public String SET_UP_PARAM[] = new String[8];
    public Graph GRAPH;
    public ArrayList<String> GRAPH_NODES = new ArrayList<>();
    
    public Graph(String vertexNumber){
        VERTICES = new ArrayList<Vertex>(Integer.parseInt(vertexNumber));
        for(String vertix : SELECTED_NODES){
            VERTICES.add(new Vertex(vertix));
        }
    }
    
//    public Graph(int pNumberVertices){
//        VERTICES = new ArrayList<Vertex>(pNumberVertices);
//        for(int vertix = 0; vertix < pNumberVertices; vertix++){
//            VERTICES.add(new Vertex("V"+Integer.toString(vertix)));
//        }
//    }
    
    public void startGraph(ArrayList<String> graphNodes, Graph graph, String parameters[]){
        SET_UP_PARAM = parameters;
        GRAPH = graph;
        GRAPH_NODES = graphNodes;
        for (String node : GRAPH_NODES) {
            int source = getNodePosition("" + node.charAt(0));
            int dest  = getNodePosition("" + node.charAt(1));
            int weight = Integer.parseInt(node.substring(2));
            GRAPH.addEdge(source, dest, weight);
        }
        insertDrones(SET_UP_PARAM[4]);
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
                SET_UP_PARAM[1],SET_UP_PARAM[2]));
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
            String path = getRandomNodes();
            insertTrack(path);
        }
//        for(Vertex vertex : GRAPH.VERTICES){
//            for(Tracks track : vertex.TRACK){
//                for(Drone drone : track.DRONES){
//                    int h = Integer.parseInt(SET_UP_PARAM[2]);
//                    int w = Integer.parseInt(SET_UP_PARAM[1]) - 4;
//                    System.out.println("Sauce: " + track.SOURCE + " Dest: " + track.DEST +
//                            " Cant = " + ((int)((w/2)*(h/3)) - drone.NUMBER_OF_DRONES));
//                }
//            }
//        }
    }
    
    public String getRandomNodes(){
        while(true){
            Random rand = new Random();
            String src = SELECTED_NODES[rand.nextInt(Integer.parseInt(SET_UP_PARAM[3]))];
            String dest = "";
            while(true){
                String newNode = SELECTED_NODES[rand.nextInt(Integer.parseInt(SET_UP_PARAM[3]))];
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
        for(String checker : GRAPH_NODES){
            if(path.charAt(0) == checker.charAt(0) && path.charAt(1) == checker.charAt(1)){
               return true; 
            }
        }
        return false;
    }
    
    public void insertTrack(String path){
        for(Vertex vertex : GRAPH.VERTICES){
            for(Tracks track : vertex.TRACK){
                if(track.SOURCE.equals("" + path.charAt(0)) && track.DEST.equals("" + path.charAt(1))){
                    if(track.DRONES.isEmpty()){
                        Drone newDrone = new Drone(SET_UP_PARAM[2],SET_UP_PARAM[1]); // (alto, ancho)
                        //newDrone.setPath("" + path.charAt(0), "" + path.charAt(1));
                        getDronePath(newDrone, "" + path.charAt(0), "" + path.charAt(1));
                        newDrone.FREE_SPACE--;
                        track.DRONES.add(newDrone);
                        FlightControl.DRONES.add(newDrone);
                    }else{
                        boolean allFull = false;
                        int save = 0;
                        for(int i = 0; i < track.DRONES.size(); i++){
                            Drone drone = track.DRONES.get(i);
                            if(drone.FULL){
                                save++;
                            }if(save == track.DRONES.size()){
                                allFull = true;
                            }   
                        }
                        if(allFull){
                            Drone newDrone = new Drone(SET_UP_PARAM[2],SET_UP_PARAM[1]);
                            //newDrone.setPath("" + path.charAt(0), "" + path.charAt(1));
                            getDronePath(newDrone, "" + path.charAt(0), "" + path.charAt(1));
                            newDrone.FREE_SPACE--;
                            track.DRONES.add(newDrone);
                            FlightControl.DRONES.add(newDrone);
                        }else{
                            track.DRONES.get(save).FREE_SPACE--;
                            if(track.DRONES.get(save).FREE_SPACE == 0){
                                track.DRONES.get(save).FULL = true;
                            }
                        }
                    }
                }
            }
        }
    }
    
//    public void addDrone(Tracks track, Drone drone){
//        if(track.WIDTH > 2){
//            track.DRONES.add(drone);
//            track.WIDTH -= 2;
//        }else if(track.HEIGHT > 3){
//            track.DRONES.add(drone);
//            track.HEIGHT -= 3;
//            track.WIDTH = Integer.parseInt(SET_UP_PARAM[1]);
//        }else{//Hay que meter los drones en una lista de espera o algo así.
//            JOptionPane.showMessageDialog(null, "No room for more drones in this track.");
//        }
//    }
    
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
    
    public void getDronePath(Drone drone, String source, String dest){
        ArrayList<String> path = getShortestPath(source, dest);
        for(String traveler : path){
            drone.PATH.add(traveler);
        }
    }
    
    public ArrayList<String> getShortestPath(String source, String dest){
        ArrayList<String> path = new ArrayList<>();
        int srcVertex = getNodePosition(source);
        calculateDijkstra(getVertex(srcVertex));
        for(Vertex vertix:getVertices()){
            if(vertix.NAME.equals(dest)){
                //System.out.print("Destiny Vertex -> "+vertix+" , Distance -> "+ vertix.MIN_DISTANCE+" , Path -> ");
                for(Vertex pathVert:vertix.PATH) {
                    path.add(pathVert.NAME);
                    //System.out.print(pathVert+" ");
                }
                path.add(vertix.NAME);
                //System.out.println(""+vertix);
                return path;
            }
        }
        return null;
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
    
    public void printDroneSize(){
        for(Vertex vertex : GRAPH.VERTICES){
            for(Tracks track : vertex.TRACK){
                System.out.println(track.DRONES.size() + "+");
            }
        }
    }
    
}
