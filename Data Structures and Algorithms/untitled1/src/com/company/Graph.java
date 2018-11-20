package com.company;

// Java program to print DFS traversal from a given given graph
import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph
{
    private int V; // No. of vertices

    // Array of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v,boolean visited[]){

        visited[v]  = true;
        System.out.println(v+" ");

        Iterator<Integer> i = adj[v].listIterator();

        while (i.hasNext()){
            int n = i.next();
            if (!visited[n]){
                DFSUtil(n,visited);
            }
        }




    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS() {
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if (!visited[i]){
                DFSUtil(i,visited);
            }
        }

    }

    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFS();
    }
}
// This code is contributed by Aakash Hasija

