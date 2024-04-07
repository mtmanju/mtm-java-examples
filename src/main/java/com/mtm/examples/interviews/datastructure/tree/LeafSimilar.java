package com.mtm.examples.interviews.datastructure.tree;

import java.util.ArrayList;

public class LeafSimilar {

        public boolean leafSimilar(TNode root1, TNode root2) {

            if(root1==null&&root2==null)
                return true;

            ArrayList<Integer>list1=new ArrayList<Integer>();
            ArrayList<Integer> list2=new ArrayList<Integer>();

            if((getLeafSequence(root1,list1)).equals(getLeafSequence(root2,list2)))
                return true;

            return false;


        }

        public ArrayList<Integer> getLeafSequence(TNode node,ArrayList<Integer>list){


            if(node.left==null&&node.right==null)
                list.add(node.val);
            if(node.left!=null)
                getLeafSequence(node.left,list);
            if(node.right!=null)
                getLeafSequence(node.right,list);


            return list;
        }

}
