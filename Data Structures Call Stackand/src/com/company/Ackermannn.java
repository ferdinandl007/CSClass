package com.company;

public class Ackermannn {
    public static int A (int m, int n){
        System.out.println("Calling A, m = " + m + " n = " + n);
        int result = 0;
        if (m == 0) result = n + 1;
        else if (m > 0 && n == 0) result = A(m-1, 1);
        else if (m > 0 && n > 0) result = A(m-1, A(m, n-1));
        System.out.println("Returning " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(A(2, 1));
    }
}
