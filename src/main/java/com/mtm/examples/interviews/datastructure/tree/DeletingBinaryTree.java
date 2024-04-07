package com.mtm.examples.interviews.datastructure.tree;

import java.util.Stack;

public class DeletingBinaryTree {


    public static void deleteBinaryTree(TreeNode root) {
        if (root == null)
            return;
        else {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode tmp = stack.peek();
                if (tmp.isLeaf(tmp)) {
                    stack.pop();
                    tmp = null;


                } else {
                    if (tmp.rightNode != null) {
                        stack.push(tmp.rightNode);
                        tmp.rightNode = null;
                    }
                    if (tmp.leftNode != null) {
                        stack.push(tmp.leftNode);
                        tmp.leftNode = null;
                    }


                }
            }

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

        deleteBinaryTree(root);
    }

}
