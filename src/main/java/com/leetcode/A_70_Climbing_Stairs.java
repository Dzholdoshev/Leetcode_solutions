package com.leetcode;


/**
Method 2: Memorization
We can use the bottom-up approach of dp to solve this problem as well
For this, we can create an array dp[] and initialize it with -1.
Whenever we see that a subproblem is not solved we can call the recursive method,
else we stop the recursion if that the subproblem is solved already.

 Complexity Analysis:
 Time Complexity: O(n)
 Auxiliary Space: O(n)
 */

public class A_70_Climbing_Stairs {

    public static void main(String[] args) {

      int result =  new A_70_Climbing_Stairs().climbStairs(5);
        System.out.println(result);
    }

    static int fib(int n, int dp[]) {  // Fibonacci number calculating method
        if (n <= 1)               //if number of steps is less or equals 1 => return 1
            return dp[n] = 1;
        if (dp[n] != -1) {  // if number N element of array is not equal -1 => return element N
            return dp[n];
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];             //[1, 1, 2, 3, 5, 8]
    }

    public int climbStairs(int n) {

        {
            int[] dp = new int[n + 1];  // new int array with n+1 length
            for (int i = 0; i < n + 1; i++) {
                dp[i] = -1;             // every element is assigned to -1
            }
          return   fib(n, dp);                // use Fibonacci number method

        }
    }


}
