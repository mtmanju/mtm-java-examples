package com.mtm.examples.interviews.datastructure.graphs;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class BreadthFirstSearch {

    int numOfVertex;
    int startNode;
    GraphUsingAdjList graphUsingAdjList;

    BreadthFirstSearch(int start,GraphUsingAdjList graphUsingAdjList){
        this.numOfVertex=graphUsingAdjList.getNumOfVertex();
        this.startNode=start;
        this.graphUsingAdjList=graphUsingAdjList;
    }


    public void BreadthFirstSearchTraversal() {


        boolean visited[] = new boolean[numOfVertex];

        LinkedList<Integer> queue=new LinkedList<Integer>();

        visited[startNode]=true;
        queue.add(startNode);

        while(!queue.isEmpty()){
            startNode=queue.poll();
            System.out.println(startNode +" ");

            Iterator<Integer> i= graphUsingAdjList.getAdjList()[startNode].iterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphUsingAdjList graph =new GraphUsingAdjList(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        BreadthFirstSearch breadthFirstSearch=new BreadthFirstSearch(0,graph);
        breadthFirstSearch.BreadthFirstSearchTraversal();

    }



}
