package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class A_94_Binary_Tree_Inorder_Traversal {


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

    public List<Integer> inorderTraversal(TreeNode root) {

        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);

        return result;


    }


}
