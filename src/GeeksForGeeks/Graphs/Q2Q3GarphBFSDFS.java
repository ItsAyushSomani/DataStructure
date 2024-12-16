package GeeksForGeeks.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 */
public class Q2Q3GarphBFSDFS {

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        Graph g = new Graph(4, adjList);
        int[] isVisited = new int[4];
        g.addEdge(adjList, 0, 1);
        g.addEdge(adjList, 0, 2);
        g.addEdge(adjList, 1, 2);
        g.addEdge(adjList, 2, 0);
        g.addEdge(adjList, 2, 3);
        g.addEdge(adjList, 3, 3);
        g.printGraph(adjList);
        System.out.println();
//        System.out.println("Following is Depth First Traversal " +
//                "(starting from vertex 2)");
//        dFS(adjList, isVisited, 2);
        System.out.println();
        System.out.println();
        System.out.println("Following is Depth First Traversal " +
                "(starting from vertex 2)");
        bFS(adjList, isVisited, 2);
    }

    private static void bFS(List<List<Integer>> adjList, int[] isVisited, int i) {
        Queue<Integer> q = new LinkedList<Integer>();
        isVisited[i] = 1;
        q.add(i);
        while (q.size() != 0) {
            int t = q.poll();
            System.out.println(t);
            isVisited[t] = 1;
            for (int s : adjList.get(t)) {
                if (isVisited[s] != 1) {
                    isVisited[s] = 1;
                    q.add(s);
                }
            }
        }
    }

    private static void dFS(ArrayList<ArrayList<Integer>> adjList, int[] visted, int v) {
        visted[v] = 1;
        System.out.print(v + " ");
        for (int i : adjList.get(v)) {
            if (visted[i] != 1) {
                dFS(adjList, visted, i);
            }
        }
    }
}
