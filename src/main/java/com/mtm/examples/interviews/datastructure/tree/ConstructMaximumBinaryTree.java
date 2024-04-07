package com.mtm.examples.interviews.datastructure.tree;

public class ConstructMaximumBinaryTree {

    public TreeNode constructMaximumBinaryTre(int[] nums) {

        if(nums.length==1)return new TreeNode(nums[0]);
        TreeNode root=null;

        return constructBinaryTree(nums,root,0,nums.length-1);

    }

    private TreeNode constructBinaryTree(int[]nums,TreeNode root,int start,int end){

        if(start>=end)return root;
        int lelement=getLargest(nums,start,end);
        int largestIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==lelement)
                largestIndex=i;

        }
        root=new TreeNode(lelement);
        root.leftNode=constructBinaryTree(nums,root,0,largestIndex-1);
        root.rightNode=constructBinaryTree(nums,root,largestIndex+1,nums.length-1);
        return root;

    }

    private int getLargest(int[]nums,int start,int end){
        int max=Integer.MIN_VALUE;
        for(int i=start;i<end;i++){
            if(nums[i]>max)
                max=nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        ConstructMaximumBinaryTree constructMaximumBinaryTree=new ConstructMaximumBinaryTree();
        int nums[]={3,2,1,6,0,5};
        TreeNode root=constructMaximumBinaryTree.constructMaximumBinaryTre(nums);
    }
}