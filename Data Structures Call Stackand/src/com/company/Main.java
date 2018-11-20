package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(chessBoardSquares(1));

    }

    public static void reverse(ArrayList<String> a) {
            if (a.size() > 1) {
                String s = a.remove(0);
                reverse(a);
                a.add(s);
            }
    }



    public static int chessBoardSquares(int n) {
        if (n == 0) return 0;
        return (n%10)*(n%10) + chessBoardSquares(n/10);
    }


    public static long factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

}
