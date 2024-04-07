package com.mtm.examples.interviews.algorithms.greedy.mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimsAlgo {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int numOfVertices=Integer.parseInt(br.readLine());
        int numOfEdges=Integer.parseInt(br.readLine());
        int weight[]=new int[numOfVertices];
        int adjMatrix[][]=new int[numOfVertices][numOfVertices];

        for(int i=0;i<numOfVertices;i++){
            for (int j=0;j<numOfVertices;j++){
                adjMatrix[i][j]=-1;
            }
            weight[i]=Integer.MAX_VALUE;
        }

        for(int i=0;i<numOfEdges;i++){

            String[] edgeDetail=br.readLine().split(" ");
            int source=Integer.parseInt(edgeDetail[0]);
            int dest=Integer.parseInt(edgeDetail[1]);
            int cost=Integer.parseInt(edgeDetail[2]);
            adjMatrix[source][dest]=cost;
            adjMatrix[dest][source]=cost;


        }
        primsMinimumSpanningTree(adjMatrix,weight,0);

    }

    private static void primsMinimumSpanningTree(int[][] adjMatrix, int[] weight, int startingVertex) {
        int numOfVertex=weight.length;
        boolean[]visited=new boolean[numOfVertex];
        int[]parent=new int[numOfVertex];
        weight[0]=0;
        parent[0]=-1;

        for(int i=0;i<numOfVertex-1;i++){

            int minVertex=findMinVertex(weight,visited);
            visited[minVertex]=true;
            for(int j=0;j<numOfVertex;j++){
                if(adjMatrix[minVertex][j]!=-1 && !visited[j] && weight[minVertex]!=Integer.MAX_VALUE){
                    int newWeight=adjMatrix[minVertex][j];
                    if(newWeight<weight[j]) {
                        weight[j] = newWeight;
                        parent[j] =minVertex;
                    }

                }
            }



        }


        for(int i=0;i<numOfVertex;i++){
            System.out.println(i+" "+parent[i]+" ");
        }
    }

    private static int findMinVertex(int[] distance, boolean[] visited) {
        int minVertex=-1;

        for (int i=0;i<distance.length;i++){
            if(!visited[i] && (minVertex==-1 || distance[i]<distance[minVertex])){
                minVertex=i;
            }
        }
        return minVertex;
    }


}
