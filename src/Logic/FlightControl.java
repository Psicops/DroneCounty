package Logic;

import UI.CountyMap;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author †Psicops†
 */
public class FlightControl {
    
    public ArrayList<String> NODE_NAMES= new ArrayList<>();
    public String SET_UP_PARAM[] = new String[8];
    public Graph GRAPH;
    public ArrayList<String> GRAPH_NODES = new ArrayList<>();
    public CountyMap UI_MAP;
    public static String[] SELECTED_NODES;
    public int FLIGHT_SECOND = 0;
    public static ArrayList<Drone> DRONES = new ArrayList<>();
    public int COMPLETED_FLIGHTS;
    public int REMAINING_FLIGHTS;
    public int CANT_DRONES;
    public int DRONES_DONE = 0;
    
    public FlightControl(){
        NODE_NAMES.add("A");NODE_NAMES.add("B");NODE_NAMES.add("C");NODE_NAMES.add("D");NODE_NAMES.add("E");NODE_NAMES.add("F");NODE_NAMES.add("G");NODE_NAMES.add("H");NODE_NAMES.add("I");NODE_NAMES.add("J");
        NODE_NAMES.add("K");NODE_NAMES.add("L");NODE_NAMES.add("M");NODE_NAMES.add("N");NODE_NAMES.add("O");NODE_NAMES.add("P");NODE_NAMES.add("Q");NODE_NAMES.add("R");NODE_NAMES.add("S");NODE_NAMES.add("T");
        NODE_NAMES.add("U");NODE_NAMES.add("V");NODE_NAMES.add("W");NODE_NAMES.add("X");NODE_NAMES.add("Y");NODE_NAMES.add("Z");NODE_NAMES.add("#");NODE_NAMES.add("$");NODE_NAMES.add("%");NODE_NAMES.add("&");
    }

    public void initiate(CountyMap map){
        UI_MAP = map;
        UI_MAP.show();
        COMPLETED_FLIGHTS = 0;
        REMAINING_FLIGHTS = Integer.parseInt(SET_UP_PARAM[4]);
        CANT_DRONES = (int)(((Integer.parseInt(SET_UP_PARAM[1])-4)/2)*(Integer.parseInt(SET_UP_PARAM[2])/3));
    }
    
    public void createGraph(ArrayList<String> graphNodes, Graph graph, String parameters[]){
        SET_UP_PARAM = parameters;
        GRAPH = graph;
        GRAPH_NODES = graphNodes;
        SELECTED_NODES = new String[Integer.parseInt(SET_UP_PARAM[3])];
        fillSelecNodes();
        int nodes = Integer.parseInt(SET_UP_PARAM[3]);
        for(int nodeNum = 0; nodeNum < nodes; nodeNum++){
            int rand = (int) (Math.random() * 30);
            if(!checkNodes(NODE_NAMES.get(rand))){
                SELECTED_NODES[nodeNum] = NODE_NAMES.get(rand);
            }else
                nodeNum--;
        }
//        System.out.println("Graph Nodes");
//        for(String i : DroneCounty.GRAPH_NODES)
//            System.out.println(i);
//        System.out.println("Selected Nodes");
//        for(String i : SELECTED_NODES)
//            System.out.println(i);
    }
    
    public void fillNodes(){
        int tracks = Integer.parseInt(SET_UP_PARAM[0]);
        for(String node : SELECTED_NODES){
            for(int trackNum = 0; trackNum < tracks; trackNum++){
                GRAPH_NODES.add(node + getCloser(node));
            }
        }
        getFlightsNumber();
        this.UI_MAP.showButtons();
    }
    
    public void getFlightsNumber(){
        int flightsNumber = Integer.parseInt(SET_UP_PARAM[4]);
        int time = Integer.parseInt(SET_UP_PARAM[5]);
        FLIGHT_SECOND = (int)flightsNumber/time;
    }
    
    public void fillSelecNodes(){
        for(int fill = 0; fill < SELECTED_NODES.length; fill++)
            SELECTED_NODES[fill] = "-";
    }
    
    private String getCloser(String node){
        int nodePos[] = UI_MAP.getPos(node);
        String closerNode = "";
        int closerDist = 10000;
        for (String nodesN : SELECTED_NODES) {
            if (!nodesN.equals(node) && !checkIn(node + nodesN)){
                int[] pos = UI_MAP.getPos(nodesN);
                int posX = Math.abs((nodePos[0] - pos[0]));
                int posY = Math.abs((nodePos[1] - pos[1]));
                int dist = (int) Math.sqrt(posX*posX + posY*posY);
                if (dist < closerDist){
                    closerNode = nodesN;
                    closerDist = dist;
                }
            }
        }
        return closerNode + closerDist;
    }
    
    private boolean checkIn(String node){
        for(int checker = 0; checker < GRAPH_NODES.size(); checker++){
            String path = GRAPH_NODES.get(checker);
            if(path.charAt(0) == node.charAt(0) && path.charAt(1) == node.charAt(1)){
                return true;
            }
        }
        return false;
    }
    
    private boolean checkNodes(String nodeName){
        for(int node = 0; node < SELECTED_NODES.length; node++) {
            if(SELECTED_NODES[node].equals(nodeName)) {
                return true;
            }
        }
        return false;
    }
    
    public void startDrones(){
        try{
            while(!DRONES.isEmpty()){
                long start = System.currentTimeMillis();
                DRONES_DONE = 0;
                while(System.currentTimeMillis() - start <= 1000 && DRONES_DONE < FLIGHT_SECOND){
                    Drone drone = DRONES.get(0);
                    moveDrones(drone);
                    updateFlights();
                    DRONES.remove(0);
                    if(DRONES.isEmpty())
                        break;
                    if(DRONES_DONE == FLIGHT_SECOND){
                        Thread.sleep(1000 - (System.currentTimeMillis() - start));
                    }
                }
                //System.out.println("Must be: " + FLIGHT_SECOND + " flights/s. -> Done: " + DRONES_DONE + " flights/s.");
            }
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, "Can't do " + FLIGHT_SECOND + " flights/s.\n");
        }
    }
    
    public void updateFlights(){
        int remain = 0;
        for(Drone drones : DRONES){
            System.out.println("");
            remain += abs(CANT_DRONES - drones.FREE_SPACE);
            System.out.println("");
        }
        REMAINING_FLIGHTS = remain;
        COMPLETED_FLIGHTS = abs(Integer.parseInt(SET_UP_PARAM[4]) - remain);
    }
    
    public void moveDrones(Drone drone){
        if(!drone.SOURCE.equals(drone.DEST)){
            if(drone.PATH.size() > 1){
                if(abs((CANT_DRONES - drone.FREE_SPACE) + DRONES_DONE) <= FLIGHT_SECOND){
                    drone.setPath(drone.PATH.get(1), drone.PATH.get(drone.PATH.size()-1));
                    DRONES_DONE += abs((CANT_DRONES - drone.FREE_SPACE));
                    drone.PATH.remove(0);
                    if(!drone.SOURCE.equals(drone.DEST))
                        moveDrones(drone);
                }else{
                    drone.FREE_SPACE += abs((FLIGHT_SECOND - DRONES_DONE));
                    drone.setPath(drone.PATH.get(1), drone.PATH.get(drone.PATH.size()-1));
                    DRONES_DONE += abs((CANT_DRONES - drone.FREE_SPACE));
                    if(!drone.SOURCE.equals(drone.DEST))
                        moveDrones(drone);
                }
            }
        }
    }
    
    public boolean divideConquer(ArrayList<Drone> drones){
        boolean done = false;
        long start = System.currentTimeMillis();
        getDC(drones);
        long finish = System.currentTimeMillis();
        if((double)(finish - start)*1.0e-9 < FLIGHT_SECOND){
            done = true;
        }
        return done;
    }
    
    public void getDC(ArrayList<Drone> drones){
        if(drones.size() >= 2){
            ArrayList<Drone> first = getHalf(drones, "1");
            getDC(first);
            ArrayList<Drone> second = getHalf(drones, "2");
            getDC(second);
        }else if(drones.size() == 1){
            moveDrones(drones.get(0));
        }
    }
    
    public ArrayList<Drone> getHalf(ArrayList<Drone> drones, String half){
        if(half.equals("1")){
            ArrayList<Drone> first = new ArrayList<>();
            for(int drone = 0 ; drone < (int)drones.size()/2; drone++){
                first.add(drones.get(drone));
            }
            return first;
        }else{
            ArrayList<Drone> second = new ArrayList<>();
            for(int drone = (int) drones.size()/2 ; drone < drones.size(); drone++){
                second.add(drones.get(drone));
            }
            return second;
        }
    }

    public boolean Probabilistic(ArrayList<Drone> drones){
        boolean done = false;
        long start = System.currentTimeMillis();
        getProba(drones);
        long finish = System.currentTimeMillis();
        if((double)(finish - start)*1.0e-9 < FLIGHT_SECOND){
            done = true;
        }
        return done;
    }
    
    public void getProba(ArrayList<Drone> drones){
        while(!drones.isEmpty()){
            Random rand = new Random();
            int random = rand.nextInt(drones.size());
            Drone drone = drones.get(random);
            moveDrones(drone);
            drones.remove(random);
        }
    }
    
    public void getBacktraking(){
        
    }
    
}
