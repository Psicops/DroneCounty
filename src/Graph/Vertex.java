package Graph;

import java.util.*;

public class Vertex implements Comparable<Vertex>{
    
    public final String NAME;
    public ArrayList<Edge> NEIGHBOURS;
    public LinkedList<Vertex> PATH;
    public double MIN_DISTANCE = Double.POSITIVE_INFINITY;
    public Vertex PREVIOUS;
    
    public int compareTo(Vertex pNext){
        return Double.compare(MIN_DISTANCE,pNext.MIN_DISTANCE);		
    }
    
    public Vertex(String pName){
        this.NAME = pName;
        NEIGHBOURS = new ArrayList<Edge>();
        PATH = new LinkedList<Vertex>();
    }

    public String toString(){
        return NAME;
    }	
    
}
