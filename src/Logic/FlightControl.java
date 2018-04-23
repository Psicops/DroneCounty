package Logic;

import Launcher.DroneCounty;
import UI.CountyMap;
import UI.SetUp;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author †Psicops†
 */
public class FlightControl {
    
    public CountyMap UI_MAP;
    public static String[] SELECTED_NODES = new String[Integer.parseInt(DroneCounty.SET_UP_PARAM[3])];
    public int FLIGHT_SECOND = 0;
    public static ArrayList<Drone> DRONES = new ArrayList<>();
    public int COMPLETED_FLIGHTS;
    public int REMAINING_FLIGHTS;
    
    
    public FlightControl(CountyMap map){
        this.UI_MAP = map;
    }

    public void initiate(){
        UI_MAP.show();
        fillSelecNodes();
        createGraph();
        COMPLETED_FLIGHTS = 0;
        REMAINING_FLIGHTS = Integer.parseInt(DroneCounty.SET_UP_PARAM[4]);
    }
    
    private void createGraph(){
        int nodes = Integer.parseInt(DroneCounty.SET_UP_PARAM[3]);
        int tracks = Integer.parseInt(DroneCounty.SET_UP_PARAM[0]);
        for(int nodeNum = 0; nodeNum < nodes; nodeNum++){
            int rand = (int) (Math.random() * 30);
            if(!checkNodes(SetUp.NODE_NAMES.get(rand))){
                SELECTED_NODES[nodeNum] = SetUp.NODE_NAMES.get(rand);
            }else
                nodeNum--;
        }
        for(String node : SELECTED_NODES){
            for(int trackNum = 0; trackNum < tracks; trackNum++){
                DroneCounty.GRAPH_NODES.add(node + getCloser(node));
            }
        }
        getFlightsNumber();
        this.UI_MAP.showButtons();
//        System.out.println("Graph Nodes");
//        for(String i : DroneCounty.GRAPH_NODES)
//            System.out.println(i);
//        System.out.println("Selected Nodes");
//        for(String i : SELECTED_NODES)
//            System.out.println(i);
    }
    
    public void getFlightsNumber(){
        int flightsNumber = Integer.parseInt(DroneCounty.SET_UP_PARAM[4]);
        int time = Integer.parseInt(DroneCounty.SET_UP_PARAM[5]);
        FLIGHT_SECOND = (int)flightsNumber/time;
    }
    
    private void fillSelecNodes(){
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
        for(int checker = 0; checker < DroneCounty.GRAPH_NODES.size(); checker++){
            String path = DroneCounty.GRAPH_NODES.get(checker);
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
                int dronesDone = 0;
                while(System.currentTimeMillis() - start <= 1000 && dronesDone < FLIGHT_SECOND){
                    Drone drone = DRONES.get(0);
                    moveDrones(drone);
                    COMPLETED_FLIGHTS++;
                    REMAINING_FLIGHTS = DRONES.size() - 1;
                    DRONES.remove(0);
                    dronesDone++;
                    if(DRONES.isEmpty())
                        break;
                    if(dronesDone == FLIGHT_SECOND){
                        Thread.sleep(1000 - (System.currentTimeMillis() - start));
                    }
                }
                System.out.println("Must be: " + FLIGHT_SECOND + " flights/s. -> Done: " + dronesDone + " flights/s.");
            }
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, "Can't do " + FLIGHT_SECOND + " flights/s.\n");
        }
    }
    
    public void moveDrones(Drone drone){
        if(!drone.SOURCE.equals(drone.DEST)){
            if(drone.PATH.size() > 1){
                drone.setPath(drone.PATH.get(1), drone.PATH.get(drone.PATH.size()-1));
                drone.PATH.remove(0);
                if(!drone.SOURCE.equals(drone.DEST))
                    moveDrones(drone);
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
