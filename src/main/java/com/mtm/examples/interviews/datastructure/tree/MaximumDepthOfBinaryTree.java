package com.mtm.examples.interviews.datastructure.tree;

public class MaximumDepthOfBinaryTree {

        public int maxDepth(TNode root) {

            int maxDepth=0;

            if(root==null)
                return 0;

            int leftMax=1+maxDepth(root.left);
            if(leftMax>maxDepth)
                maxDepth=leftMax;
            int rightMax=1+maxDepth(root.right);
            if(rightMax>maxDepth)
                maxDepth=rightMax;

            return maxDepth;


        }

}
