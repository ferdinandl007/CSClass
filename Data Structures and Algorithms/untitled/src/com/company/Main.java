package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            int y = Integer.parseInt(reverse(line));
            System.out.println("x "+ x);
            System.out.println("y "+ y);
            int sum = x + y;
            System.out.println("sum " + sum);
            String strSum = Integer.toString(sum);
            char[] arr = strSum.toCharArray();

            while (isDuplicate(arr) && strSum.length() < 10) {
                System.out.println(sum);
                x = sum;
                y = Integer.parseInt(reverse(strSum));
                sum = x + y;
                System.out.println(sum +" = " + x + " + " + y);
                strSum = Integer.toString(sum);
                arr = strSum.toCharArray();
            }

            System.out.println(sum);
        }


    }

    static String reverse(String x){
        String reverse = "";
        for(int i = x.length() - 1; i >= 0; i--)
        {
            reverse = reverse + x.charAt(i);
        }
        return reverse;
    }

    static boolean  isDuplicate(char str[]){

        HashSet<Character> h = new HashSet<>();

        for (int i=0; i<=str.length-1; i++)
        {
            char c = str[i];

            if (h.contains(c))
                return true;

            else
                h.add(c);
        }

        return false;
    }


}
