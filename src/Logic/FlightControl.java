package Logic;

import Launcher.DroneCounty;
import UI.CountyMap;
import UI.SetUp;

/**
 *
 * @author †Psicops†
 */
public class FlightControl {
    
    public CountyMap UI;
    public static String[] SELECTED_NODES = new String[Integer.parseInt(DroneCounty.SET_UP_PARAM[3])];
    public static int FLIGHT_SECOND = 0;
    
    public FlightControl(CountyMap map){
        this.UI = map;
    }

    public void initiate(){
        UI.show();
        fillSelecNodes();
        createGraph();
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
        this.UI.showButtons();
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
        FLIGHT_SECOND = (int)time/flightsNumber;
    }
    
    private void fillSelecNodes(){
        for(int fill = 0; fill < SELECTED_NODES.length; fill++)
            SELECTED_NODES[fill] = "-";
    }
    
    private String getCloser(String node){
        int nodePos[] = UI.getPos(node);
        String closerNode = "";
        int closerDist = 10000;
        for (String nodesN : SELECTED_NODES) {
            if (!nodesN.equals(node) && !checkIn(node + nodesN)){
                int[] pos = UI.getPos(nodesN);
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
    
    public void getBacktraking(){
        
    }
    
    public void getDC(){
        
    }
    
    public void getProba(){
        
    }
    
    public void moveDrones(){
        
    }
    
}
