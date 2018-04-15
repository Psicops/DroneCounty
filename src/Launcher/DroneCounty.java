package Launcher;

/**
 *
 * @author †Psicops†
 */

import Logic.Graph;
import UI.SetUp;
import java.util.ArrayList;

public class DroneCounty {

    public static String SET_UP_PARAM[] = new String[8];
    public static ArrayList<String> GRAPH_NODES = new ArrayList<String>(); //GRAPH_NODES.add("AB55");
    
    public static void main(String[] args) {
        
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        SetUp setup = new SetUp();
        setup.show();
        
        Graph myGraph = new Graph(9);

        /*myGraph.addEdge(0, 1, 4); myGraph.addEdge(0, 7, 8); myGraph.addEdge(1, 2, 8); 
        myGraph.addEdge(1, 7, 11); myGraph.addEdge(2, 1, 8); myGraph.addEdge(2, 8, 2); 
        myGraph.addEdge(2, 5, 4); myGraph.addEdge(2, 3, 7); myGraph.addEdge(3, 2, 7); 
        myGraph.addEdge(3, 5, 14); myGraph.addEdge(3, 4, 9); myGraph.addEdge(4, 3, 9); 
        myGraph.addEdge(4, 5, 10); myGraph.addEdge(5, 4, 10); myGraph.addEdge(5, 3, 9); 
        myGraph.addEdge(5, 2, 4); myGraph.addEdge(5, 6, 2); myGraph.addEdge(6, 7, 1); 
        myGraph.addEdge(6, 8, 6); myGraph.addEdge(6, 5, 2); myGraph.addEdge(7, 0, 8); 
        myGraph.addEdge(7, 8, 7); myGraph.addEdge(7, 1, 11); myGraph.addEdge(7, 6, 1);
        myGraph.addEdge(8, 2, 2); myGraph.addEdge(8, 7, 7); myGraph.addEdge(8, 6, 6);
        
        myGraph.calculate(myGraph.getVertex(2));
        
        myGraph.printMinimumDistance();*/
        
    }
    
}
