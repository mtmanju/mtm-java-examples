package com.mtm.examples.interviews.datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {


    public static void postOrdrerIterative(TreeNode root){

        //Queue nodeQueue=new LinkedList();
        Stack<TreeNode> stack=new Stack();
        //TreeNode currentNode=root;
        ArrayList<Integer> resultList= new ArrayList<Integer>();
        stack.push(root);

        while(!stack.isEmpty()){

            TreeNode currentNode=stack.peek();
            if(currentNode.isLeaf(currentNode))
                resultList.add(stack.pop().getData());
            else{
                if(currentNode.rightNode!=null){
                    stack.push(currentNode.rightNode);
                    currentNode.rightNode=null;
                }
                if(currentNode.leftNode!=null){
                    stack.push(currentNode.leftNode);
                    currentNode.leftNode=null;
                }
            }


                }


                for(int i=0;i<resultList.size();i++){
                    System.out.printf(resultList.get(i)+" ");
                }
            }
            public static void preOrderIterative(TreeNode root){
                Stack<TreeNode> stack=new Stack();
                ArrayList<Integer> resultList= new ArrayList<Integer>();
                stack.push(root);

                while(!stack.isEmpty()){



                    TreeNode currentNode=stack.pop();
                    resultList.add(currentNode.getData());

                    if(currentNode.rightNode!=null)
                        stack.push(currentNode.rightNode);
                    if(currentNode.leftNode!=null)
                        stack.push(currentNode.leftNode);



                    }




            }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode n2= new TreeNode(2);
        TreeNode n3= new TreeNode(3);
        TreeNode n4= new TreeNode(4);
        TreeNode n5= new TreeNode(5);
        TreeNode n6= new TreeNode(6);
        TreeNode n7= new TreeNode(7);

        root.setLeftNode(n2);
        root.setRightNode(n3);
        n2.setLeftNode(n4);
        n2.setRightNode(n5);
        n3.setLeftNode(n6);
        n3.setRightNode(n7);

        postOrdrerIterative(root);


    }


}
