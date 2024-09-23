import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);
        Vertex v7 = new Vertex(7);

      
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addVertex(v6);
        graph.addVertex(v7);

        
        graph.addEdge(v1, v2);
        graph.addEdge(v1, v4);
        graph.addEdge(v2, v3);
        graph.addEdge(v2, v5);
        graph.addEdge(v3, v6);
        graph.addEdge(v4, v7);
        graph.addEdge(v5, v6);
        graph.addEdge(v7, v6);

       
        System.out.println("Graph structure:");
        graph.printGraph();

      
        List<Vertex> longestPath = graph.findLongestPath(v1, v6);
        
        if (longestPath.isEmpty()) {
            System.out.println("No path exists from v1 to v6");
        } else {
            System.out.println("Longest path from v1 to v6:");
            for (Vertex v : longestPath) {
                System.out.print(v + " ");
            }
            System.out.println("\nPath length: " + (longestPath.size() - 1));
        }
    }
}
