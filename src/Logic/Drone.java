package Logic;

import java.util.ArrayList;

/**
 *
 * @author †Psicops†
 */
public class Drone {
    
    public final int HEIGHT = 3;
    public final int WIDTH = 2;
    public final int LENGTH = 2;
    public String SOURCE = "";
    public String DEST = "";
    public ArrayList<String> PATH = new ArrayList<>();
    
    public Drone(){

    }
    
    public void setPath(String src, String dest){
        this.SOURCE = src;
        this.DEST = dest;
    }
    
    public String getSource(){
        return this.SOURCE;
    }
    
    public String getDest(){
        return this.DEST;
    }
    
}
