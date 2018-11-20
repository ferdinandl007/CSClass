package com.company;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeRegExp.test;

public class Main {
    String A = "abcd";
    String B = "cdabcdab";




    static int LongestPathWithSameValue(int[] A, int[] E) {

        int n = A.length;
        List<List<Integer> > edges = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            edges.add(new ArrayList<>());
        }
        for(int i = 0; i < n - 1; i++){
            int a = E[2 * i];
            int b = E[2 * i + 1];
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int temp= dfs(i,-1,0,A,edges);
            if(temp > ans){
                ans = temp;
            }
        }
        return ans;

        "".toCharArray()
    }
    static int dfs(int root,int father,int cnt,int [] A, List<List<Integer> > list){
        int ans = cnt;
        for(int son : list.get(root)){
            if(son != father && A[root - 1] == A[son - 1]){
                int temp = dfs(son,root,cnt + 1,A,list);
                if(temp > ans){
                    ans = temp;
                }
            }
        }

        return ans;

    }





    public static void main(String[] args) {
	// write your code here
        int[]  A = {1, 1, 1, 2, 2};
        int[] E = {1, 2, 1, 3, 2, 4, 2, 5};

       System.out.println(LongestPathWithSameValue(A,E));





    }




    static int bob(String a,String b){
        String c = a;
        int y = 1;
        while (!c.contains(b) && c.length() < 1000){
            c = c + a;
            y++;
        }
        if (c.length() >= 1000){
            return -1;
        } else return y;

    }



}
