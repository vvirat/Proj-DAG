import java.util.*;

public class Graph {
    private Map<Vertex, List<Edge>> adjacencyList = new HashMap<>();

    public void addVertex(Vertex v) {
        adjacencyList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(Vertex from, Vertex to) {
        adjacencyList.get(from).add(new Edge(from, to));
    }

    public List<Vertex> findLongestPath(Vertex start, Vertex end) {
        Map<Vertex, Integer> distanceMap = new HashMap<>();
        Map<Vertex, Vertex> previousVertexMap = new HashMap<>();
        for (Vertex v : adjacencyList.keySet()) {
            distanceMap.put(v, Integer.MIN_VALUE);
            previousVertexMap.put(v, null);
        }
        distanceMap.put(start, 0);

        List<Vertex> topologicalOrder = topologicalSort();
        for (Vertex v : topologicalOrder) {
            for (Edge e : adjacencyList.get(v)) {
                if (distanceMap.get(v) != Integer.MIN_VALUE && distanceMap.get(v) + 1 > distanceMap.get(e.to)) {
                    distanceMap.put(e.to, distanceMap.get(v) + 1);
                    previousVertexMap.put(e.to, v);
                }
            }
        }

        if (distanceMap.get(end) == Integer.MIN_VALUE) {
            return new ArrayList<>(); // No path exists
        }

    
        List<Vertex> path = new ArrayList<>();
        for (Vertex v = end; v != null; v = previousVertexMap.get(v)) {
            path.add(v);
        }
        Collections.reverse(path);
        return path;
    }

    private List<Vertex> topologicalSort() {
        Set<Vertex> visited = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();
        for (Vertex v : adjacencyList.keySet()) {
            if (!visited.contains(v)) {
                topologicalSortUtil(v, visited, stack);
            }
        }
        List<Vertex> order = new ArrayList<>();
        while (!stack.isEmpty()) {
            order.add(stack.pop());
        }
        return order;
    }

    private void topologicalSortUtil(Vertex v, Set<Vertex> visited, Stack<Vertex> stack) {
        visited.add(v);
        for (Edge e : adjacencyList.get(v)) {
            if (!visited.contains(e.to)) {
                topologicalSortUtil(e.to, visited, stack);
            }
        }
        stack.push(v);
    }

    public void printGraph() {
        for (Map.Entry<Vertex, List<Edge>> entry : adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Edge e : entry.getValue()) {
                System.out.print(e.to + " ");
            }
            System.out.println();
        }
    }
}
