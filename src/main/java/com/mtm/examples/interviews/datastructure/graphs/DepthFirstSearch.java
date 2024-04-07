package com.mtm.examples.interviews.datastructure.graphs;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Stack;

public class DepthFirstSearch {

    GraphUsingAdjList graphUsingAdjList;
    int startNode;
    Stack<Integer> vertexStack=new Stack();
    boolean visited[];
    boolean popped;
    int init ;



    DepthFirstSearch(GraphUsingAdjList graphUsingAdjList,int startNode){
        this.graphUsingAdjList=graphUsingAdjList;
        this.startNode=startNode;
        int numOfVertex=graphUsingAdjList.getNumOfVertex();
        this.visited=new boolean[numOfVertex];
        this.init=startNode;

    }

    public void depthFirstTraversal(int startNode){
        this.startNode=startNode;
        int node;

if(!popped)
        vertexStack.push(startNode);
        visited[startNode]=true;

        while(!vertexStack.isEmpty()||startNode==init){

            if(!popped) {
                node = vertexStack.peek();
                System.out.println(node + " ");
            }else{
                node=startNode;
            }


            Iterator<Integer> i= graphUsingAdjList.getAdjList()[node].iterator();

            while(i.hasNext()){
                int next=i.next();
                if(!visited[next]){
                    popped= false;

                depthFirstTraversal(next);


                }else{
                    continue;
                }
            }
if(!vertexStack.isEmpty()) {
    int poppedElement = vertexStack.pop();
    popped = true;
    depthFirstTraversal(poppedElement);
}



        }
    }

    public static void main(String[] args) {
        GraphUsingAdjList graph =new GraphUsingAdjList(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(1, 5);
        graph.addEdge(1, 6);

        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        graph.addEdge(3, 2);
        graph.addEdge(3, 0);
        graph.addEdge(3, 4);

        graph.addEdge(4, 2);
        graph.addEdge(4, 3);
        graph.addEdge(4, 6);

        graph.addEdge(5, 1);

        graph.addEdge(6, 1);
        graph.addEdge(6, 4);


        DepthFirstSearch depthFirstSearch=new DepthFirstSearch(graph,0);
        depthFirstSearch.depthFirstTraversal(0);

    }


}
