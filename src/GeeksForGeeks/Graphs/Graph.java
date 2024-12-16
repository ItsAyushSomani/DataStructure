package GeeksForGeeks.Graphs;

import java.util.*;

/**
 *
 */
public class Graph {
    //    public static int vertex = 5;
//
//    public Graph(int vert, ArrayList<ArrayList<Integer>> adjList) {
//        vertex = vert;
//        for (int i = 0; i < vertex; i++) {
//            adjList.add(new ArrayList<Integer>());
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
//        Graph g = new Graph(5, adjList);
//        addEdge(adjList, 0, 1);
//        addEdge(adjList, 0, 4);
//        addEdge(adjList, 1, 2);
//        addEdge(adjList, 1, 3);
//        addEdge(adjList, 1, 4);
//        addEdge(adjList, 2, 3);
//        addEdge(adjList, 3, 4);
//        printGraph(adjList);
//    }
//
    public static void printGraph(List<List<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println("Adjacenecy list of " + i);
            System.out.print("head ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" => ");
                System.out.print(adjList.get(i).get(j));
            }
            System.out.println();
        }
    }

    //
//    public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
//        adjList.get(u).add(v);
//        adjList.get(v).add(u);
//    }
    //    0  --- > 1 --->2
    //    4  ----- 3
    //
    public static void main(String[] args) {

        List<List<Integer>> adjList = new ArrayList<>();
        Graph graph = new Graph(8, adjList);

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 4);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);

        addEdge(adjList, 5, 6);
        addEdge(adjList, 5, 7);

        printGraph(adjList);


        //DAG Graph
        int V = 4;

        // Edges
        List<List<Integer>> edges = new ArrayList<>();
        Graph dagGraph = new Graph(V, edges);
        addEdgeDirected(edges, 0, 1);
        addEdgeDirected(edges, 1, 2);
        addEdgeDirected(edges, 3, 1);
        addEdgeDirected(edges, 3, 2);


        boolean[] visited = new boolean[adjList.size()];
        int i = 0;
        System.out.println("bfs is");
        while (i < adjList.size()) {
            if (!visited[i]) {
                bfs(adjList, i, visited);
            }
            i++;
        }


        System.out.println("dfs is");
        boolean[] visitedDfs = new boolean[adjList.size()];
        i = 0;
        while (i < adjList.size()) {
            if (!visitedDfs[i]) {
                dfs(adjList, i, visitedDfs);
            }
            i++;
        }


        System.out.println("dfs with recursion is");
        boolean[] visitedDfsStack = new boolean[adjList.size()];
        dfsStack(adjList, 0, visitedDfsStack);

        System.out.println();
        System.out.println("cycle with recursion is");
        boolean[] visitedCycle = new boolean[adjList.size()];
        i = 0;
        while (i < adjList.size()) {
            if (!visitedCycle[i]) {
                System.out.println("i is" + i);
                if (cycle(adjList, i, visitedCycle, -1))
                    System.out.println("No Cycle Detected");
                else
                    System.out.println("Cycle Detected");
                System.out.println();
            }
            i++;
        }


        System.out.println();
        System.out.println("Topological is");
        boolean[] visitedDirected = new boolean[edges.size()];
        Stack<Integer> stack = new Stack<>();
        i = 0;
        while (i < edges.size()) {
            if (!visitedDirected[i]) {
                topologicalSortDfs(edges, i, visitedDirected, stack);
            }
            i++;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println("Topological bfs kahns");
        boolean[] visitedTopo = new boolean[edges.size()];
        i = 0;
        while (i < edges.size()) {
            if (!visitedTopo[i]) {
                topologicalSortKahn(edges, i, visitedTopo);
            }
            i++;
        }

    }

    private static void addEdgeDirected(List<List<Integer>> edges, int source, int dest) {
        edges.get(source).add(dest);
    }

    private static void topologicalSortDfs(List<List<Integer>> adjList, int src, boolean[] visitedDirected, Stack<Integer> stack) {
        visitedDirected[src] = true;
        for (Integer node : adjList.get(src)) {
            if (!visitedDirected[node]) {
                topologicalSortDfs(adjList, node, visitedDirected, stack);
            }
        }
        stack.push(src);
    }

    private static void dfsStack(List<List<Integer>> adjList, int src, boolean[] visitedDfs) {
        visitedDfs[src] = true;
        System.out.print(src + "    ");
        for (Integer node : adjList.get(src)) {
            if (!visitedDfs[node]) {
                dfsStack(adjList, node, visitedDfs);
            }
        }
    }

    public Graph(int vertex, List<List<Integer>> adjList) {
        for (int i = 0; i < vertex; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    //    public static void printGraph(List<List<Integer>> adjList) {
//        for (List<Integer> adj: adjList)
//            System.out.println(adj);
//    }
    public static void addEdge(List<List<Integer>> adjList, int source, int dest) {
        adjList.get(source).add(dest);
        adjList.get(dest).add(source);
    }

    public static void bfs(List<List<Integer>> adjList, int src, boolean[] visited) {

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(src);
        visited[src] = true;

        while (!q.isEmpty()) {
            Integer tempNode = q.poll();
            System.out.print(tempNode + "   ");
            for (Integer vertex : adjList.get(tempNode)) {
                if (!visited[vertex]) {
                    q.add(vertex);
                    visited[vertex] = true;
                }
            }
        }
        System.out.println();
    }

    public static void dfs(List<List<Integer>> adjList, int src, boolean[] visited) {

        Stack<Integer> stack = new Stack<>();
        stack.add(src);
        visited[src] = true;
        while (!stack.isEmpty()) {
            Integer tempNode = stack.pop();
            System.out.print(tempNode + "   ");
            for (Integer vertex : adjList.get(tempNode)) {
                if (!visited[vertex]) {
                    stack.add(vertex);
                    visited[vertex] = true;
                }
            }
        }
        System.out.println();
    }


    private static boolean cycle(List<List<Integer>> adjList, int src, boolean[] visitedDfs, int parent) {
        visitedDfs[src] = true;
        for (Integer node : adjList.get(src)) {
            if (!visitedDfs[node]) {
                cycle(adjList, node, visitedDfs, node);
            } else if (parent != node) {
                return false;
            }
        }
        return true;
    }

    private static boolean cycleDirected(List<List<Integer>> adjList, int src, boolean[] visitedDfs, boolean[] parentStack) {
        visitedDfs[src] = true;
        parentStack[src] = true;
        for (Integer node : adjList.get(src)) {
            if (!visitedDfs[node]) {
                cycle(adjList, node, visitedDfs, node);
            } else if (parentStack[node]) {
                return false;
            }
        }
        parentStack[src] = false;
        return true;
    }

    private static void topologicalSortKahn(List<List<Integer>> adjList, int src, boolean[] visitedDfs) {

        int[] inDegree = new int[adjList.size()];
        for (List<Integer> nodeList : adjList) {
            for (Integer node : nodeList) {
                ++inDegree[node];
            }
        }

        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
                visitedDfs[i] = true;
            }
        }

        while (!q.isEmpty()) {
            Integer tempNode = q.poll();
            System.out.print(tempNode + "   ");
            for (Integer vertex : adjList.get(tempNode)) {
                if (!visitedDfs[vertex] && --inDegree[vertex] == 0) {
                    q.add(vertex);
                    visitedDfs[vertex] = true;
                }
            }
        }
        System.out.println();
    }

}
