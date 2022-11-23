package com.leetcode;


public class A_100_Same_Tree {
    public static void main(String[] args) {
        TreeNode treeNodeP = new TreeNode(1, new TreeNode(2),new TreeNode(3));
        TreeNode treeNodeQ = new TreeNode(1, new TreeNode(2),new TreeNode(3));
        System.out.println( isSameTree(treeNodeP,treeNodeQ) );

    }

public static boolean isSameTree(TreeNode p, TreeNode q){
// p and q are both null
    if(p==null && q==null) return true;

    //if one p or q is null
    if(q==null || p==null) return  false;

    if(p.val != q.val ) return false;

    return isSameTree(p.right, q.right) && isSameTree(p.left,q .left);

}

}
