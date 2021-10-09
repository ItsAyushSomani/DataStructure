package GeeksForGeeks.Graphs;

import java.util.ArrayList;

/**
 *
 */
public class Graph {
    public static int vertex = 5;

    public Graph(int vert, ArrayList<ArrayList<Integer>> adjList) {
        vertex = vert;
        for (int i = 0; i < vertex; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        Graph g = new Graph(5, adjList);
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 4);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);
        printGraph(adjList);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adjList) {
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

    public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
}
