package com.mtm.examples.interviews.datastructure.tree;

public class TreeNode {

    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public boolean isLeaf(TreeNode node){
        return node.rightNode==null?node.leftNode==null:false;
    }
}
