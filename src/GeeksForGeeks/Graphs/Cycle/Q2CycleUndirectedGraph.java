package GeeksForGeeks.Graphs.Cycle;

import GeeksForGeeks.Graphs.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Q2CycleUndirectedGraph {

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
//        Graph g = new Graph(5, adjList);
     int[] isVisited = new int[3];
//        g.addEdge(adjList, 1, 0);
//        g.addEdge(adjList, 0, 2);
//        g.addEdge(adjList, 2, 1);
//        g.addEdge(adjList, 0, 3);
//        g.addEdge(adjList, 3, 4);

        Graph g2 = new Graph(3, adjList);
        g2.addEdge(adjList, 0, 1);
        g2.addEdge(adjList, 1, 2);
        g2.printGraph(adjList);

        for (int u = 0; u < 3; u++)
        {

            // Don't recur for u if already visited
            if (isVisited[u] == 0)
                if (isCyclic(adjList, isVisited, u, -1)) {
                    System.out.println(true);
                    return;
                }
        }
//        if (isCyclic(adjList, isVisited, 0, -1))
//            System.out.println("Graph contains cycle");
//        else
            System.out.println("Graph doesn't contains cycle");
//        System.out.println();
    }

    private static boolean isCyclic(List<List<Integer>> adjList, int[] isVisited, int source, int parent) {
        isVisited[source] = 1;
        for (int i : adjList.get(source)) {
            if (isVisited[i] != 0) {
                if (isCyclic(adjList, isVisited, i, source)) {
                    return true;
                }
            } else if (i != parent) {
                return true;
            }
        }
        return false;
    }
}
