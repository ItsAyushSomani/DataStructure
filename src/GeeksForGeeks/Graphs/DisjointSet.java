package GeeksForGeeks.Graphs;

import java.util.List;

public class DisjointSet {
    int[] parent;
    int[] rank;

    DisjointSet(int size) {
        this.parent = new int[size];
        this.rank = new int[size];
        for(int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int unionFind(int search) {
        if(parent[search] == search) return search;

        return parent[search] = unionFind(parent[search]);
    }

    void union(int X, int Y) {
        int findX = unionFind(X);
        int findY = unionFind(Y);

        if(findX == findY) return;

        if(rank[findX] > rank[findY])
            parent[findY] = findX;
        else if(rank[findY] > rank[findX])
            parent[findX] = findY;
        else {
            parent[findX] = findY;
            rank[findY]++;
        }



    }
}
