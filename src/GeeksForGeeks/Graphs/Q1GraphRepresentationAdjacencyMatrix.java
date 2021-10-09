package GeeksForGeeks.Graphs;

/**
 *
 */
public class Q1GraphRepresentationAdjacencyMatrix {
    int[][] adjacencyMatrix;

    public Q1GraphRepresentationAdjacencyMatrix(int vertex) {
        adjacencyMatrix = new int[vertex][vertex];
    }

    public void printGraph() {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        //add bak edge for undirected graph
        adjacencyMatrix[destination][source] = 1;
    }


    public static void main(String[] args) {
        Q1GraphRepresentationAdjacencyMatrix graph = new Q1GraphRepresentationAdjacencyMatrix(3);
        graph.printGraph();
    }
}
