package com.mtm.examples.interviews.datastructure.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DfsUsingAdjacencyMatrix {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());//number of vertices
        int e=Integer.parseInt(br.readLine());//number of edges

        int[][] edges= new int[n][n];
        boolean visited[]=new boolean[n];


        for(int i=0;i<n;i++){
            visited[i]=false;
            for(int j=0;j<n;j++) {

                edges[i][j] = 0;
            }

        }

        for(int i=0;i<e ;i++){
            String[] edge=br.readLine().split(" ");
            int start=Integer.parseInt(edge[0]);
            int end=Integer.parseInt(edge[1]);

            edges[start][end]=1;
            edges[end][start]=1;

        }


        printDfs(edges,n,0,visited);
    }

    private static void printDfs(int[][] edges, int numOfVertices, int startingVertex, boolean[] visited) {

        System.out.print(startingVertex + " ");
        visited[startingVertex]=true;
       // int m=Integer.M

        for (int i=0;i<numOfVertices;i++){
            if (!visited[i]) {
                if (edges[startingVertex][i] == 1) {
                    printDfs(edges, numOfVertices, i, visited);
                }
            }
        }


    }
}
