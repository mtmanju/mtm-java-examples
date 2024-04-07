package com.mtm.examples.interviews.datastructure.graphs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class NodeCountUsingBFS {


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int numOfVertices= Integer.parseInt(br.readLine());
        int[][]adjMatrix =new int[numOfVertices][numOfVertices];
        int numOfEdges=Integer.parseInt(br.readLine());

        int level= Integer.parseInt(br.readLine());
        boolean[]visited=new boolean[numOfVertices];

        int count =0;

        for(int i = 0; i<numOfEdges;i++){
            String[] edgeInfo=br.readLine().split(" ");
            int source =Integer.parseInt(edgeInfo[0]);
            int dest= Integer.parseInt(edgeInfo[1]);
            adjMatrix[source][dest]=1;
            adjMatrix[dest][source]=1;
        }

        System.out.println(numberOfNodes(adjMatrix,level,numOfVertices,0,visited));

    }

    private static int numberOfNodes(int[][] adjMatrix, int level, int numOfVertices,int start,boolean[]visited) {

        int count =0;
        visited[start]=true;
        Queue<Integer>queue=new LinkedList<Integer>();
        queue.add(start);

        while(!queue.isEmpty()){
            if(count==level)
                return queue.size();

                int currentNode=queue.poll();

            for(int i=0;i<numOfVertices;i++){
                if(adjMatrix[currentNode][i]==1 && !visited[i]){
                    visited[i]=true;
                    queue.add(i);
                }
            }
            count++;
        }
        return 0;
    }
}
