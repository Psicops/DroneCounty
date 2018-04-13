package DroneCounty;

import Graph.Graph;

public class DroneCounty {

    public static void main(String[] args) {
        
        Graph myGraph = new Graph(9);

        myGraph.addEdge(0, 1, 4); myGraph.addEdge(0, 7, 8); myGraph.addEdge(1, 2, 8); 
        myGraph.addEdge(1, 7, 11); myGraph.addEdge(2, 1, 8); myGraph.addEdge(2, 8, 2); 
        myGraph.addEdge(2, 5, 4); myGraph.addEdge(2, 3, 7); myGraph.addEdge(3, 2, 7); 
        myGraph.addEdge(3, 5, 14); myGraph.addEdge(3, 4, 9); myGraph.addEdge(4, 3, 9); 
        myGraph.addEdge(4, 5, 10); myGraph.addEdge(5, 4, 10); myGraph.addEdge(5, 3, 9); 
        myGraph.addEdge(5, 2, 4); myGraph.addEdge(5, 6, 2); myGraph.addEdge(6, 7, 1); 
        myGraph.addEdge(6, 8, 6); myGraph.addEdge(6, 5, 2); myGraph.addEdge(7, 0, 8); 
        myGraph.addEdge(7, 8, 7); myGraph.addEdge(7, 1, 11); myGraph.addEdge(7, 6, 1);
        myGraph.addEdge(8, 2, 2); myGraph.addEdge(8, 7, 7); myGraph.addEdge(8, 6, 6);
        
        myGraph.calculate(myGraph.getVertex(2));
        
        myGraph.printMinimumDistance();
        
    }
    
}
