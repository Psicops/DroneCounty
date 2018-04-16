package Logic;

import java.util.ArrayList;

/**
 *
 * @author †Psicops†
 */

public class Tracks {
    
    public String SOURCE;
    public String DEST;
    public int WIDTH;
    public int HEIGHT;
    public ArrayList<Drone> DRONES;
    
    public Tracks(String src, String dest, String width, String height){
        SOURCE = src;
        DEST = dest;
        WIDTH = Integer.parseInt(width);
        HEIGHT = Integer.parseInt(height);
        DRONES = new ArrayList<>();
    }
    
}
