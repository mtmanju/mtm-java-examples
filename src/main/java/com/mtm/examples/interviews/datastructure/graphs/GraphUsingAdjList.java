package com.mtm.examples.interviews.datastructure.graphs;

import java.util.LinkedList;
import java.util.List;

public class GraphUsingAdjList {

    private int numOfVertex;
    private LinkedList<Integer> adjList[];

    public GraphUsingAdjList(int numOfVertex){
        this.numOfVertex=numOfVertex;
        this.adjList=new LinkedList[numOfVertex];

        for(int i=0;i<numOfVertex;i++)
            adjList[i]=new LinkedList<Integer>();
    }

    public void addEdge(int src,int dest){
        adjList[src].add(dest);
    }

    public int getNumOfVertex() {
        return numOfVertex;
    }

    public void setNumOfVertex(int numOfVertex) {
        this.numOfVertex = numOfVertex;
    }

    public LinkedList<Integer>[] getAdjList() {
        return adjList;
    }

    public void setAdjList(LinkedList<Integer>[] adjList) {
        this.adjList = adjList;
    }
}
