package UI;

/**
 *
 * @author †Psicops†
 */

import Launcher.DroneCounty;
import Logic.FlightControl;
import Logic.Graph;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SetUp extends javax.swing.JFrame {
    
    public static ArrayList<String> NODE_NAMES= new ArrayList<>();
    
    public SetUp() {
        NODE_NAMES.add("A");NODE_NAMES.add("B");NODE_NAMES.add("C");NODE_NAMES.add("D");NODE_NAMES.add("E");NODE_NAMES.add("F");NODE_NAMES.add("G");NODE_NAMES.add("H");NODE_NAMES.add("I");NODE_NAMES.add("J");
        NODE_NAMES.add("K");NODE_NAMES.add("L");NODE_NAMES.add("M");NODE_NAMES.add("N");NODE_NAMES.add("O");NODE_NAMES.add("P");NODE_NAMES.add("Q");NODE_NAMES.add("R");NODE_NAMES.add("S");NODE_NAMES.add("T");
        NODE_NAMES.add("U");NODE_NAMES.add("V");NODE_NAMES.add("W");NODE_NAMES.add("X");NODE_NAMES.add("Y");NODE_NAMES.add("Z");NODE_NAMES.add("#");NODE_NAMES.add("$");NODE_NAMES.add("%");NODE_NAMES.add("&");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        tfWidth = new javax.swing.JTextField();
        tfHeight = new javax.swing.JTextField();
        lblNumberTravels = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        tfTime = new javax.swing.JTextField();
        tfNumberTravels = new javax.swing.JTextField();
        lblNumberStations = new javax.swing.JLabel();
        tfNumberTracks = new javax.swing.JTextField();
        lblNumberTracks = new javax.swing.JLabel();
        tfNumberStations = new javax.swing.JTextField();
        lblAlgorithm = new javax.swing.JLabel();
        cbAlgorithm = new javax.swing.JComboBox<>();
        bReady = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfHour = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drone County");
        setMinimumSize(new java.awt.Dimension(420, 330));
        setResizable(false);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DroneCounty.jpg"))); // NOI18N

        lblWidth.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWidth.setText("Tracks Width (m): ");

        lblHeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblHeight.setText("Tracks Height (m):");

        tfWidth.setMaximumSize(new java.awt.Dimension(6, 20));
        tfWidth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfWidthKeyTyped(evt);
            }
        });

        tfHeight.setMaximumSize(new java.awt.Dimension(6, 20));
        tfHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHeightActionPerformed(evt);
            }
        });
        tfHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHeightKeyTyped(evt);
            }
        });

        lblNumberTravels.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNumberTravels.setText("Number of Travels:");

        lblTime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTime.setText("Time (s):");

        tfTime.setMaximumSize(new java.awt.Dimension(6, 20));
        tfTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTimeKeyTyped(evt);
            }
        });

        tfNumberTravels.setMaximumSize(new java.awt.Dimension(6, 20));
        tfNumberTravels.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumberTravelsKeyTyped(evt);
            }
        });

        lblNumberStations.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNumberStations.setText("Number of Stations:");

        tfNumberTracks.setMaximumSize(new java.awt.Dimension(6, 20));
        tfNumberTracks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumberTracksActionPerformed(evt);
            }
        });
        tfNumberTracks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumberTracksKeyTyped(evt);
            }
        });

        lblNumberTracks.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNumberTracks.setText("Number of Tracks:");

        tfNumberStations.setMaximumSize(new java.awt.Dimension(6, 20));
        tfNumberStations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumberStationsActionPerformed(evt);
            }
        });
        tfNumberStations.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumberStationsKeyTyped(evt);
            }
        });

        lblAlgorithm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAlgorithm.setText("Select a Algorithm:");

        cbAlgorithm.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbAlgorithm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Divide and Conquer", "Backtracking", "Probabilistic" }));

        bReady.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        bReady.setText("Ready");
        bReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReadyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Hour/Simulation (s):");

        tfHour.setMaximumSize(new java.awt.Dimension(6, 20));
        tfHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHourKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(bReady)
                        .addGap(203, 203, 203))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNumberTracks)
                                        .addComponent(lblHeight)
                                        .addComponent(lblWidth))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tfNumberTracks, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblNumberStations)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfNumberStations, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lblNumberTravels))
                                                .addComponent(tfWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfNumberTravels, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGap(0, 45, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(lblTime))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(23, 23, 23)
                                    .addComponent(tfHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblAlgorithm)))
                            .addGap(18, 18, 18)
                            .addComponent(cbAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLogo)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumberTracks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumberTracks)
                    .addComponent(tfNumberStations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumberStations))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWidth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeight)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumberTravels, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumberTravels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTime)
                            .addComponent(tfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlgorithm)
                    .addComponent(cbAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(bReady)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHeightActionPerformed

    private void tfNumberTracksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumberTracksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumberTracksActionPerformed

    private void tfNumberStationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumberStationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumberStationsActionPerformed

    private void bReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReadyActionPerformed
        if(tfNumberStations.getText().equals(""))
            DroneCounty.SET_UP_PARAM[3] = "2";
        else if(Integer.parseInt(tfNumberStations.getText()) > 30){
            JOptionPane.showMessageDialog(null, "You can only choose a number of Stations from 2 to 30.\n30 stations selected.");
            DroneCounty.SET_UP_PARAM[3] = "30";
        }else if(Integer.parseInt(tfNumberStations.getText()) < 2){
            JOptionPane.showMessageDialog(null, "You can only choose a number of Stations from 2 to 30.\n 2 stations selected.");
            DroneCounty.SET_UP_PARAM[3] = "2";
        }else
            DroneCounty.SET_UP_PARAM[3] = tfNumberStations.getText();
        if(tfNumberTracks.getText().equals(""))
            DroneCounty.SET_UP_PARAM[0] = "1";
        else if(Integer.parseInt(tfNumberTracks.getText()) > Integer.parseInt(DroneCounty.SET_UP_PARAM[3]) - 1){
            JOptionPane.showMessageDialog(null, "You can only choose a number of Tracks from 1 to "
                    +(Integer.parseInt(DroneCounty.SET_UP_PARAM[3])-1)+".\n "
                    +(Integer.parseInt(DroneCounty.SET_UP_PARAM[3])-1)+" tracks selected.");
            DroneCounty.SET_UP_PARAM[0] = Integer.parseInt(DroneCounty.SET_UP_PARAM[3])-1 + "";
        }else if(Integer.parseInt(tfNumberTracks.getText()) < 1){
            JOptionPane.showMessageDialog(null, "You can only choose a number of Tracks from 1 to "
                    +(Integer.parseInt(DroneCounty.SET_UP_PARAM[3])-1)+".\n 1 track selected.");
            DroneCounty.SET_UP_PARAM[0] = "1";
        }else
            DroneCounty.SET_UP_PARAM[0] = tfNumberTracks.getText();
        if(tfWidth.getText().equals(""))
            DroneCounty.SET_UP_PARAM[1] = "1000";
        else if(Integer.parseInt(tfWidth.getText()) < 500){
            JOptionPane.showMessageDialog(null, "You can only choose a width between 500m and 1000m.\n 500m selected.");
            DroneCounty.SET_UP_PARAM[1] = "500";
        }
        else if(Integer.parseInt(tfWidth.getText()) > 1000){
            JOptionPane.showMessageDialog(null, "You can only choose a width between 500m and 1000m.\n 1000m selected.");
            DroneCounty.SET_UP_PARAM[1] = "1000";
        }
        else
            DroneCounty.SET_UP_PARAM[1] = tfWidth.getText();
        if(tfHeight.getText().equals(""))
            DroneCounty.SET_UP_PARAM[2] = "1000";
        else if(Integer.parseInt(tfHeight.getText()) < 500){
            JOptionPane.showMessageDialog(null, "You can only choose a height between 500m and 1000m.\n 500m selected.");
            DroneCounty.SET_UP_PARAM[2] = "500";
        }
        else if(Integer.parseInt(tfHeight.getText()) > 1000){
            JOptionPane.showMessageDialog(null, "You can only choose a height between 500m and 1000m.\n 1000m selected.");
            DroneCounty.SET_UP_PARAM[2] = "1000";
        }
        else
            DroneCounty.SET_UP_PARAM[2] = tfHeight.getText();
        if(tfNumberTravels.getText().equals(""))
            DroneCounty.SET_UP_PARAM[4] = "100";
        else
            DroneCounty.SET_UP_PARAM[4] = tfNumberTravels.getText();
        if(tfTime.getText().equals(""))
            DroneCounty.SET_UP_PARAM[5] = "10";
        else
            DroneCounty.SET_UP_PARAM[5] = tfTime.getText();
        DroneCounty.SET_UP_PARAM[6] = cbAlgorithm.getSelectedItem().toString();
        if(tfHour.getText().equals("") || Integer.parseInt(tfHour.getText()) < 1)
            DroneCounty.SET_UP_PARAM[7] = "1";
        else
            DroneCounty.SET_UP_PARAM[7] = tfHour.getText();
        
        CountyMap map = new CountyMap();
        
        FlightControl flightControl = new FlightControl(map);
        flightControl.initiate();

        DroneCounty.MY_GRAPH = new Graph(DroneCounty.SET_UP_PARAM[3]);
        
        DroneCounty.MY_GRAPH.startGraph();
        
        this.dispose();
    }//GEN-LAST:event_bReadyActionPerformed

    private void tfNumberTracksKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumberTracksKeyTyped
        char character = evt.getKeyChar();
        if(character <'0'|| character > '9')
            evt.consume();
    }//GEN-LAST:event_tfNumberTracksKeyTyped

    private void tfHeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHeightKeyTyped
        char character = evt.getKeyChar();
        if(character <'0'|| character > '9')
            evt.consume();
    }//GEN-LAST:event_tfHeightKeyTyped

    private void tfWidthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWidthKeyTyped
        char character = evt.getKeyChar();
        if(character <'0'|| character > '9')
            evt.consume();
    }//GEN-LAST:event_tfWidthKeyTyped

    private void tfNumberStationsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumberStationsKeyTyped
        char character = evt.getKeyChar();
        if(character <'0'|| character > '9')
            evt.consume();
    }//GEN-LAST:event_tfNumberStationsKeyTyped

    private void tfNumberTravelsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumberTravelsKeyTyped
        char character = evt.getKeyChar();
        if(character <'0'|| character > '9')
            evt.consume();
    }//GEN-LAST:event_tfNumberTravelsKeyTyped

    private void tfTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTimeKeyTyped
        char character = evt.getKeyChar();
        if(character <'0'|| character > '9')
            evt.consume();
    }//GEN-LAST:event_tfTimeKeyTyped

    private void tfHourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHourKeyTyped
        char character = evt.getKeyChar();
        if(character <'0'|| character > '9')
            evt.consume();
    }//GEN-LAST:event_tfHourKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bReady;
    private javax.swing.JComboBox<String> cbAlgorithm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAlgorithm;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNumberStations;
    private javax.swing.JLabel lblNumberTracks;
    private javax.swing.JLabel lblNumberTravels;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JTextField tfHeight;
    private javax.swing.JTextField tfHour;
    private javax.swing.JTextField tfNumberStations;
    private javax.swing.JTextField tfNumberTracks;
    private javax.swing.JTextField tfNumberTravels;
    private javax.swing.JTextField tfTime;
    private javax.swing.JTextField tfWidth;
    // End of variables declaration//GEN-END:variables
}
