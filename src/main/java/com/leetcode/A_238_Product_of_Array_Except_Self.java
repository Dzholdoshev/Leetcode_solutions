package com.leetcode;

public class A_238_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {

        int[] products = new int[nums.length];
        int leftRunningProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            products[i] = leftRunningProduct;
            leftRunningProduct *= nums[i]; }
        int rightRunningProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            products[i] *= rightRunningProduct;
            rightRunningProduct *= nums[i]; }
        return products;

    }
}
