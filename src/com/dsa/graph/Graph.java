package com.dsa.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }


    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        System.out.println("starting at : " + s);
        queue.add(s);

        System.out.println("BFS : " );
        while (queue.size() != 0) {
            s = queue.poll();

            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }



   void DFS(int s) {
       boolean visited[] = new boolean[V];
       Stack<Integer> stack = new Stack<>();
       stack.add(s);
       visited[s] = true;

       System.out.println("DFS : ");

       while (!stack.isEmpty()) {
           int current = stack.pop();
           System.out.print(current + " ");
           Iterator<Integer> i = adj[current].listIterator();
           while (i.hasNext()) {
               int n = i.next();
               if (!visited[n]) {
                   stack.add(n);
                   visited[n] = true;
               }
           }

       }
   }


    public static void main(String[] args) {


        Graph g = new Graph(8);
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(1,4);
        g.addEdge(4,1);
        g.addEdge(4,6);
        g.addEdge(6,4);
        g.addEdge(6,0);
        g.addEdge(0,6);
        g.addEdge(1,5);
        g.addEdge(5,1);
        g.addEdge(5,3);
        g.addEdge(3,5);
        g.addEdge(3,0);
        g.addEdge(0,3);
        g.addEdge(5,2);
        g.addEdge(2,5);
        g.addEdge(2,7);
        g.addEdge(7,2);


        System.out.println("BFS : starting from 0");
        g.BFS(0);

       System.out.println("\nDFS : starting from 0");
       g.DFS(0);

    }


}
