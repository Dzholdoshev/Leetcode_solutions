package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class A_144_Binary_Tree_Preorder_Traversal {

    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(A_145_Binary_Tree_Postorder_Traversal.TreeNode root ) {


        if(root==null)return result;
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;

    }
}
