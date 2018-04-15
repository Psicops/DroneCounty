package Interface;

import DroneCounty.DroneCounty;
import java.awt.Graphics;

/**
 *
 * @author †Psicops†
 */
public class CountyMap extends javax.swing.JFrame {

    public static String[] SELECTED_NODES = new String[Integer.parseInt(DroneCounty.SET_UP_PARAM[3])];
    
    public CountyMap() {
        initComponents();
        hideButtons();
        fillSelecNodes();
        createGraph();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NodeA = new javax.swing.JButton();
        NodeB = new javax.swing.JButton();
        NodeC = new javax.swing.JButton();
        NodeD = new javax.swing.JButton();
        NodeE = new javax.swing.JButton();
        NodeF = new javax.swing.JButton();
        NodeG = new javax.swing.JButton();
        NodeH = new javax.swing.JButton();
        NodeI = new javax.swing.JButton();
        NodeJ = new javax.swing.JButton();
        NodeK = new javax.swing.JButton();
        NodeL = new javax.swing.JButton();
        NodeM = new javax.swing.JButton();
        NodeN = new javax.swing.JButton();
        NodeO = new javax.swing.JButton();
        NodeP = new javax.swing.JButton();
        NodeQ = new javax.swing.JButton();
        NodeR = new javax.swing.JButton();
        NodeS = new javax.swing.JButton();
        NodeT = new javax.swing.JButton();
        NodeU = new javax.swing.JButton();
        NodeV = new javax.swing.JButton();
        NodeW = new javax.swing.JButton();
        NodeX = new javax.swing.JButton();
        NodeY = new javax.swing.JButton();
        NodeZ = new javax.swing.JButton();
        NodeHash = new javax.swing.JButton();
        NodePercent = new javax.swing.JButton();
        NodeAnd = new javax.swing.JButton();
        NodeDollar = new javax.swing.JButton();
        bStart = new javax.swing.JButton();
        Map = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(1200, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NodeA.setText("A");
        NodeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeAActionPerformed(evt);
            }
        });
        getContentPane().add(NodeA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 30));

        NodeB.setText("B");
        NodeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeBActionPerformed(evt);
            }
        });
        getContentPane().add(NodeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        NodeC.setText("C");
        NodeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeCActionPerformed(evt);
            }
        });
        getContentPane().add(NodeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 30));

        NodeD.setText("D");
        NodeD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeDActionPerformed(evt);
            }
        });
        getContentPane().add(NodeD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, 30));

        NodeE.setText("E");
        NodeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeEActionPerformed(evt);
            }
        });
        getContentPane().add(NodeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, -1, 30));

        NodeF.setText("F");
        NodeF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeFActionPerformed(evt);
            }
        });
        getContentPane().add(NodeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, -1, 30));

        NodeG.setText("G");
        NodeG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeGActionPerformed(evt);
            }
        });
        getContentPane().add(NodeG, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, 30));

        NodeH.setText("H");
        NodeH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeHActionPerformed(evt);
            }
        });
        getContentPane().add(NodeH, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 30));

        NodeI.setText("I");
        NodeI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeIActionPerformed(evt);
            }
        });
        getContentPane().add(NodeI, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 30));

        NodeJ.setText("J");
        NodeJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeJActionPerformed(evt);
            }
        });
        getContentPane().add(NodeJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, 30));

        NodeK.setText("K");
        NodeK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeKActionPerformed(evt);
            }
        });
        getContentPane().add(NodeK, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, 30));

        NodeL.setText("L");
        NodeL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeLActionPerformed(evt);
            }
        });
        getContentPane().add(NodeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, -1, 30));

        NodeM.setText("M");
        NodeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeMActionPerformed(evt);
            }
        });
        getContentPane().add(NodeM, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, -1, 30));

        NodeN.setText("N");
        NodeN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeNActionPerformed(evt);
            }
        });
        getContentPane().add(NodeN, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 370, -1, 30));

        NodeO.setText("O");
        NodeO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeOActionPerformed(evt);
            }
        });
        getContentPane().add(NodeO, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, -1, 30));

        NodeP.setText("P");
        NodeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodePActionPerformed(evt);
            }
        });
        getContentPane().add(NodeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, -1, 30));

        NodeQ.setText("Q");
        NodeQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeQActionPerformed(evt);
            }
        });
        getContentPane().add(NodeQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, -1, 30));

        NodeR.setText("R");
        NodeR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeRActionPerformed(evt);
            }
        });
        getContentPane().add(NodeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 490, -1, 30));

        NodeS.setText("S");
        NodeS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeSActionPerformed(evt);
            }
        });
        getContentPane().add(NodeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, -1, 30));

        NodeT.setText("T");
        NodeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeTActionPerformed(evt);
            }
        });
        getContentPane().add(NodeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, -1, 30));

        NodeU.setText("U");
        NodeU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeUActionPerformed(evt);
            }
        });
        getContentPane().add(NodeU, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 670, -1, 30));

        NodeV.setText("V");
        NodeV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeVActionPerformed(evt);
            }
        });
        getContentPane().add(NodeV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, -1, 30));

        NodeW.setText("W");
        NodeW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeWActionPerformed(evt);
            }
        });
        getContentPane().add(NodeW, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, -1, 30));

        NodeX.setText("X");
        NodeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeXActionPerformed(evt);
            }
        });
        getContentPane().add(NodeX, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, 30));

        NodeY.setText("Y");
        NodeY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeYActionPerformed(evt);
            }
        });
        getContentPane().add(NodeY, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, 30));

        NodeZ.setText("Z");
        NodeZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeZActionPerformed(evt);
            }
        });
        getContentPane().add(NodeZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, 30));

        NodeHash.setText("#");
        NodeHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeHashActionPerformed(evt);
            }
        });
        getContentPane().add(NodeHash, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, 30));

        NodePercent.setText("%");
        NodePercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodePercentActionPerformed(evt);
            }
        });
        getContentPane().add(NodePercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, 30));

        NodeAnd.setText("&");
        NodeAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeAndActionPerformed(evt);
            }
        });
        getContentPane().add(NodeAnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, 30));

        NodeDollar.setText("$");
        NodeDollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeDollarActionPerformed(evt);
            }
        });
        getContentPane().add(NodeDollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, 30));

        bStart.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bStart.setText("Start");
        bStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartActionPerformed(evt);
            }
        });
        getContentPane().add(bStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Map.jpg"))); // NOI18N
        Map.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Map, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NodeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeAActionPerformed

    private void NodeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeBActionPerformed

    private void NodeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeCActionPerformed

    private void NodeDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeDActionPerformed

    private void NodeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeEActionPerformed

    private void NodeFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeFActionPerformed

    private void NodeGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeGActionPerformed

    private void NodeHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeHActionPerformed

    private void NodeIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeIActionPerformed

    private void NodeJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeJActionPerformed

    private void NodeKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeKActionPerformed

    private void NodeLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeLActionPerformed

    private void NodeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeMActionPerformed

    private void NodeNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeNActionPerformed

    private void NodeOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeOActionPerformed

    private void NodePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodePActionPerformed

    private void NodeQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeQActionPerformed

    private void NodeRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeRActionPerformed

    private void NodeSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeSActionPerformed

    private void NodeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeTActionPerformed

    private void NodeUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeUActionPerformed

    private void NodeVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeVActionPerformed

    private void NodeWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeWActionPerformed

    private void NodeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeXActionPerformed

    private void NodeYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeYActionPerformed

    private void NodeZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeZActionPerformed
    private void fillSelecNodes(){
        for(int fill = 0; fill < SELECTED_NODES.length; fill++)
            SELECTED_NODES[fill] = "-";
    }
    private void NodeHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeHashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeHashActionPerformed

    private void NodePercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodePercentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodePercentActionPerformed

    private void NodeAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeAndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeAndActionPerformed

    private void NodeDollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeDollarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NodeDollarActionPerformed
    
    private void hideButtons(){
        NodeA.setVisible(false);NodeAnd.setVisible(false);NodeB.setVisible(false);NodeC.setVisible(false);NodeD.setVisible(false);NodeDollar.setVisible(false);NodeE.setVisible(false);NodeF.setVisible(false);
        NodeG.setVisible(false);NodeH.setVisible(false);NodeHash.setVisible(false);NodeI.setVisible(false);NodeJ.setVisible(false);NodeK.setVisible(false);NodeL.setVisible(false);NodeM.setVisible(false);
	NodeN.setVisible(false);NodeO.setVisible(false);NodeP.setVisible(false);NodePercent.setVisible(false);NodeQ.setVisible(false);NodeR.setVisible(false);NodeS.setVisible(false);NodeT.setVisible(false);
	NodeU.setVisible(false);NodeV.setVisible(false);NodeW.setVisible(false);NodeX.setVisible(false);NodeY.setVisible(false);NodeZ.setVisible(false);
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
        showButtons();
        /*System.out.println("Graph Nodes");
        for(int i = 0; i < DroneCounty.GRAPH_NODES.size(); i++)
            System.out.println(DroneCounty.GRAPH_NODES.get(i));
        System.out.println("Selected Nodes");
        for(int i = 0; i < SELECTED_NODES.length; i++)
            System.out.println(SELECTED_NODES[i]);*/
    }
    
    private void drawArcs(){
        Graphics graphics = this.getGraphics();
        for(int arcs = 0; arcs < DroneCounty.GRAPH_NODES.size(); arcs++){
            int sourceNode[] = getPos(""+DroneCounty.GRAPH_NODES.get(arcs).charAt(0));
            int destNode[] = getPos(""+DroneCounty.GRAPH_NODES.get(arcs).charAt(1));
            graphics.drawLine(sourceNode[0]+25, sourceNode[1]+45, destNode[0]+25, destNode[1]+50);
        }
    }
    
    private void showButtons(){
        for(String node : DroneCounty.GRAPH_NODES){
            node = "" + node.charAt(0);
            if(NodeA.getText().equals(node)){
                NodeA.setVisible(true);
            }else if(NodeAnd.getText().equals(node)){
                NodeAnd.setVisible(true);
            }else if(NodeB.getText().equals(node)){
                NodeB.setVisible(true);
            }else if(NodeC.getText().equals(node)){
                NodeC.setVisible(true);
            }else if(NodeD.getText().equals(node)){
                NodeD.setVisible(true);
            }else if(NodeDollar.getText().equals(node)){
                NodeDollar.setVisible(true);
            }else if(NodeE.getText().equals(node)){
                NodeE.setVisible(true);
            }else if(NodeF.getText().equals(node)){
                NodeF.setVisible(true);
            }else if(NodeG.getText().equals(node)){
                NodeG.setVisible(true);
            }else if(NodeH.getText().equals(node)){
                NodeH.setVisible(true);
            }else if(NodeHash.getText().equals(node)){
                NodeHash.setVisible(true);
            }else if(NodeI.getText().equals(node)){
                NodeI.setVisible(true);
            }else if(NodeJ.getText().equals(node)){
                NodeJ.setVisible(true);
            }else if(NodeK.getText().equals(node)){
                NodeK.setVisible(true);
            }else if(NodeL.getText().equals(node)){
                NodeL.setVisible(true);
            }else if(NodeM.getText().equals(node)){
                NodeM.setVisible(true);
            }else if(NodeN.getText().equals(node)){
                NodeN.setVisible(true);
            }else if(NodeO.getText().equals(node)){
                NodeO.setVisible(true);
            }else if(NodeP.getText().equals(node)){
                NodeP.setVisible(true);
            }else if(NodePercent.getText().equals(node)){
                NodePercent.setVisible(true);
            }else if(NodeQ.getText().equals(node)){
                NodeQ.setVisible(true);
            }else if(NodeR.getText().equals(node)){
                NodeR.setVisible(true);
            }else if(NodeS.getText().equals(node)){
                NodeS.setVisible(true);
            }else if(NodeT.getText().equals(node)){
                NodeT.setVisible(true);
            }else if(NodeU.getText().equals(node)){
                NodeU.setVisible(true);
            }else if(NodeV.getText().equals(node)){
                NodeV.setVisible(true);
            }else if(NodeW.getText().equals(node)){
                NodeW.setVisible(true);
            }else if(NodeX.getText().equals(node)){
                NodeX.setVisible(true);
            }else if(NodeY.getText().equals(node)){
                NodeY.setVisible(true);
            }else if(NodeZ.getText().equals(node)){
                NodeZ.setVisible(true);
            }
        }
    }
    
    private String getCloser(String node){
        int nodePos[] = getPos(node);
        String closerNode = "";
        int closerDist = 10000;
        for (String nodesN : SELECTED_NODES) {
            if (!nodesN.equals(node) && !checkIn(node + nodesN)){
                int[] pos = getPos(nodesN);
                int dist = Math.abs((nodePos[0]+nodePos[1]) - (pos[0] + pos[1]));
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
    
    private int[] getPos(String node){
        int pos[] = new int[2];
        if(NodeA.getText().equals(node)){
            pos[0] = NodeA.getX();
            pos[1] = NodeA.getY();
        }else if(NodeAnd.getText().equals(node)){
            pos[0] = NodeAnd.getX();
            pos[1] = NodeAnd.getY();
        }else if(NodeB.getText().equals(node)){
            pos[0] = NodeB.getX();
            pos[1] = NodeB.getY();
        }else if(NodeC.getText().equals(node)){
            pos[0] = NodeC.getX();
            pos[1] = NodeC.getY();
        }else if(NodeD.getText().equals(node)){
            pos[0] = NodeD.getX();
            pos[1] = NodeD.getY();
        }else if(NodeDollar.getText().equals(node)){
            pos[0] = NodeDollar.getX();
            pos[1] = NodeDollar.getY();
        }else if(NodeE.getText().equals(node)){
            pos[0] = NodeE.getX();
            pos[1] = NodeE.getY();
        }else if(NodeF.getText().equals(node)){
            pos[0] = NodeF.getX();
            pos[1] = NodeF.getY();
        }else if(NodeG.getText().equals(node)){
            pos[0] = NodeG.getX();
            pos[1] = NodeG.getY();
        }else if(NodeH.getText().equals(node)){
            pos[0] = NodeH.getX();
            pos[1] = NodeH.getY();
        }else if(NodeHash.getText().equals(node)){
            pos[0] = NodeHash.getX();
            pos[1] = NodeHash.getY();
        }else if(NodeI.getText().equals(node)){
            pos[0] = NodeI.getX();
            pos[1] = NodeI.getY();
        }else if(NodeJ.getText().equals(node)){
            pos[0] = NodeJ.getX();
            pos[1] = NodeJ.getY();
        }else if(NodeK.getText().equals(node)){
            pos[0] = NodeK.getX();
            pos[1] = NodeK.getY();
        }else if(NodeL.getText().equals(node)){
            pos[0] = NodeL.getX();
            pos[1] = NodeL.getY();
        }else if(NodeM.getText().equals(node)){
            pos[0] = NodeM.getX();
            pos[1] = NodeM.getY();
        }else if(NodeN.getText().equals(node)){
            pos[0] = NodeN.getX();
            pos[1] = NodeN.getY();
        }else if(NodeO.getText().equals(node)){
            pos[0] = NodeO.getX();
            pos[1] = NodeO.getY();
        }else if(NodeP.getText().equals(node)){
            pos[0] = NodeP.getX();
            pos[1] = NodeP.getY();
        }else if(NodePercent.getText().equals(node)){
            pos[0] = NodePercent.getX();
            pos[1] = NodePercent.getY();
        }else if(NodeQ.getText().equals(node)){
            pos[0] = NodeQ.getX();
            pos[1] = NodeQ.getY();
        }else if(NodeR.getText().equals(node)){
            pos[0] = NodeR.getX();
            pos[1] = NodeR.getY();
        }else if(NodeS.getText().equals(node)){
            pos[0] = NodeS.getX();
            pos[1] = NodeS.getY();
        }else if(NodeT.getText().equals(node)){
            pos[0] = NodeT.getX();
            pos[1] = NodeT.getY();
        }else if(NodeU.getText().equals(node)){
            pos[0] = NodeU.getX();
            pos[1] = NodeU.getY();
        }else if(NodeV.getText().equals(node)){
            pos[0] = NodeV.getX();
            pos[1] = NodeV.getY();
        }else if(NodeW.getText().equals(node)){
            pos[0] = NodeW.getX();
            pos[1] = NodeW.getY();
        }else if(NodeX.getText().equals(node)){
            pos[0] = NodeX.getX();
            pos[1] = NodeX.getY();
        }else if(NodeY.getText().equals(node)){
            pos[0] = NodeY.getX();
            pos[1] = NodeY.getY();
        }else if(NodeZ.getText().equals(node)){
            pos[0] = NodeZ.getX();
            pos[1] = NodeZ.getY();
        }
        return pos;
    }
    
    private void bStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartActionPerformed
        drawArcs();
        bStart.setEnabled(false);
    }//GEN-LAST:event_bStartActionPerformed

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
            java.util.logging.Logger.getLogger(CountyMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CountyMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CountyMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CountyMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CountyMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Map;
    private javax.swing.JButton NodeA;
    private javax.swing.JButton NodeAnd;
    private javax.swing.JButton NodeB;
    private javax.swing.JButton NodeC;
    private javax.swing.JButton NodeD;
    private javax.swing.JButton NodeDollar;
    private javax.swing.JButton NodeE;
    private javax.swing.JButton NodeF;
    private javax.swing.JButton NodeG;
    private javax.swing.JButton NodeH;
    private javax.swing.JButton NodeHash;
    private javax.swing.JButton NodeI;
    private javax.swing.JButton NodeJ;
    private javax.swing.JButton NodeK;
    private javax.swing.JButton NodeL;
    private javax.swing.JButton NodeM;
    private javax.swing.JButton NodeN;
    private javax.swing.JButton NodeO;
    private javax.swing.JButton NodeP;
    private javax.swing.JButton NodePercent;
    private javax.swing.JButton NodeQ;
    private javax.swing.JButton NodeR;
    private javax.swing.JButton NodeS;
    private javax.swing.JButton NodeT;
    private javax.swing.JButton NodeU;
    private javax.swing.JButton NodeV;
    private javax.swing.JButton NodeW;
    private javax.swing.JButton NodeX;
    private javax.swing.JButton NodeY;
    private javax.swing.JButton NodeZ;
    private javax.swing.JButton bStart;
    // End of variables declaration//GEN-END:variables
}
