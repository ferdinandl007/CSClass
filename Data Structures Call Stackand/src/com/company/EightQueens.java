package com.company;

public class EightQueens {
    static int[] x = new int[8];
    static boolean[] a = new boolean[8];
    static boolean[] b = new boolean[15];
    static boolean[] c = new boolean[15];
    // x[i] is position of queen in i th column
    // a[j] means "no queen lies on j th row"
    // b[k] means "no queen occupies k th /-diagonal"
    // c[k] means "no queen occupies k th \-diagonal"
    // in /-diagonal k is i+j
    // in \-diagonal k is i-j+7

    public static void writeIt() {
        for (int k = 0; k <= 7; k++) {
            System.out.print(" " + x[k]);
        }
        System.out.println();
    } // end writeIt

    public static void tryIt(int i) {
        for (int j = 0; j <= 7; j++) { // corrected from Oberon version
            if (a[j] && b[i + j] && c[i - j + 7]) {
                x[i] = j;
                a[j] = false; b[i + j] = false; c[i - j + 7] = false;
                if (i < 7)
                    tryIt(i + 1);
                else
                    writeIt();
                a[j] = true; b[i + j] = true; c[i - j + 7] = true;
            }
        }
    } // end tryIt

    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) a[i] = true;
        for (int i = 0; i <= 14; i++) {
            b[i] = true; c[i] = true;
        }
        tryIt(0);
    }
}
