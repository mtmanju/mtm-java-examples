package com.mtm.examples.interviews.datastructure.graphs;

public class GraphUsingAdjMatrix {

    private int vertexCount;
    private Boolean adjMatrix[][];

    public GraphUsingAdjMatrix(int noOfVertex){
        this.vertexCount=noOfVertex;
        this.adjMatrix=new Boolean[vertexCount][vertexCount];
    }

    public void addEdge(int i,int j){
        if(i>=0 && i<vertexCount && j >=0 && j<vertexCount){
            adjMatrix[i][j]=true;
            adjMatrix[j][i]=true;
        }
    }

    public void removeEdge(int i,int j){
        if(i>=0 && i<vertexCount && j >=0 && j<vertexCount){
            adjMatrix[i][j]=false;
            adjMatrix[j][i]=false;
        }
    }

    public Boolean isEdge(int i, int j){
        if(i>=0 && i<vertexCount && j >=0 && j<vertexCount){
            return adjMatrix[i][j];
        }
        return false;
    }


}
