package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class A_145_Binary_Tree_Postorder_Traversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        if(root==null)return result;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);


        return result;

    }

}
