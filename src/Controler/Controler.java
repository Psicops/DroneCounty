package Controler;

import Logic.FlightControl;
import Logic.Graph;
import UI.CountyMap;
import UI.SetUp;
import java.util.ArrayList;

/**
 *
 * @author †Psicops†
 */
public class Controler {
    
    public String SET_UP_PARAM[] = new String[8];
    public SetUp SET_UP = new SetUp();
    public FlightControl FLIGHT_CONTROL;
    public Graph MY_GRAPH;
    public ArrayList<String> GRAPH_NODES = new ArrayList<>(); //GRAPH_NODES.add("AB55");
    
    public Controler(){
        
    }
    
    class readyThread extends Thread{
        
        @Override
        public void run(){
            while(true){
                System.out.print("");
                if(SET_UP.READY_PRESSED == true){
                    SET_UP_PARAM = SET_UP.SET_UP_PARAM;
                    FLIGHT_CONTROL = new FlightControl();
                    
                    FLIGHT_CONTROL.createGraph(GRAPH_NODES, MY_GRAPH, SET_UP_PARAM);
                    
                    MY_GRAPH = new Graph(SET_UP_PARAM[3]);
                    
                    CountyMap map = new CountyMap();
                    map.initiate(GRAPH_NODES, SET_UP_PARAM, FLIGHT_CONTROL);
        
                    FLIGHT_CONTROL.initiate(map);
                    FLIGHT_CONTROL.fillNodes();

                    MY_GRAPH.startGraph(GRAPH_NODES, MY_GRAPH, SET_UP_PARAM);
                    break;
                }
            }
        }
    }
    
    public void start(){
        Thread ready = new readyThread();
        SET_UP.show();
        ready.start();
    }
    
}
