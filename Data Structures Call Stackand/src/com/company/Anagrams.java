package com.company;

import java.util.Scanner;

public class Anagrams {

    private static void recursivePermute(char[] sa, int start) {
        int len = sa.length;

        if (start == len) System.out.println(sa);
        else {
            for (int i = start; i < len; i++) {
                char temp = sa[start];
                sa[start] = sa[i];
                sa[i] = temp;
                recursivePermute(sa, start + 1);
                sa[i] = sa[start];
                sa[start] = temp;
            } // for
        } // if
    } // recursivePermute

    private static void permuteString(String s) {
        char[] sa = new char[s.length()];
        for (int i = 0; i < s.length(); i++) sa[i] = s.charAt(i);
            recursivePermute(sa, 0);
    }

    public static void main(String[] args) {
        System.out.print("String to permute? ");
        Scanner keyboard = new Scanner(System.in);
        String initial = keyboard.next();
        permuteString(initial);
    }

}
