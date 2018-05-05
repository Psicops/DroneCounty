package Logic;

import java.util.ArrayList;

/**
 *
 * @author †Psicops†
 */
public class Drone {
    
    public String SOURCE = "";
    public String DEST = "";
    public int FREE_SPACE;
    public boolean FULL = false;
    public ArrayList<String> PATH = new ArrayList<>();
    
    public Drone(String height, String width){
        int h = Integer.parseInt(height);
        int w = Integer.parseInt(width) - 4;
        FREE_SPACE = (int)((w/2)*(h/3));
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
