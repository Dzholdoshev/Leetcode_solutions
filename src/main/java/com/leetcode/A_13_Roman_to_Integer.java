package com.leetcode;

class A_13_Roman_to_Integer {
    public int romanToInt(String s) {

        if (s.length() > 15) {
            System.err.println("Invalid length of the string");
            System.exit(1);
        }
        if (s.contains("I") || s.contains("V") || s.contains("X") || s.contains("L") || s.contains("C") || s.contains("D") || s.contains("M")) {

        } else {
            System.out.println("Invalid roman digits");
            System.exit(1);
        }

        int M = 1000;
        int D = 500;
        int C = 100;
        int L = 50;
        int X = 10;
        int V = 5;
        int I = 1;


        char[] array = s.toCharArray();

        //MCMXCIV 1000+100+1000+10+100+1+5=2216
        //         M      C      M    X     C   I  V
        //        1000 - 100 + 1000 -10 + 100 -1 +5
        //        0    -100  -100  -10-10 -1-1

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'M') {
                sum += M;
            } else if (array[i] == 'D') {
                sum += D;
            } else if (array[i] == 'C') {
                sum += C;
            } else if (array[i] == 'L') {
                sum += L;
            } else if (array[i] == 'X') {
                sum += X;
            } else if (array[i] == 'V') {
                sum += V;
            } else if (array[i] == 'I') {
                sum += I;
            }

        }


        if (s.indexOf('C') < s.lastIndexOf('M') && s.indexOf('C') >= 0) {
            sum -= 200;
            // System.out.println("C<M");

        } else if (s.indexOf('C') < s.indexOf('D') && s.indexOf('C') >= 0) {
            sum -= 200;

            // System.out.println("C<D");
        }

        if (s.indexOf('X') < s.lastIndexOf('C') && s.indexOf('X') >= 0) {
            sum -= 20;
            //  System.out.println("X<C");
        } else if (s.indexOf('X') < s.indexOf('L') && s.indexOf('X') >= 0) {
            sum -= 20;
            // System.out.println("X<L");
        }

        if (s.indexOf('I') < s.lastIndexOf('X') && s.indexOf('I') >= 0) {
            sum -= 2;
            //  System.out.println("I<X");
        } else if (s.indexOf('I') < s.indexOf('V') && s.indexOf('I') >= 0) {
            sum -= 2;
            //  System.out.println("I<V");

        }
        return sum;
    }
}