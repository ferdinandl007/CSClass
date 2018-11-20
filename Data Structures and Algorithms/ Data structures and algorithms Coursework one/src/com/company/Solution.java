package com.company;

public class Solution {
    static class Node{
        int data;
        Node right , left;
        public Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }

    }
    static Node n ;

    static public int getPrevious(int i){
        Node local = n;
        Node previousNode = n;
        boolean x = true;
        while (x){
            if (local.data < i){
                if (local.left != null){
                    local = local.left;
                    previousNode = local;
                } else{

                    x =  false;
                }
            }else if (local.data > i){
                if (local.right != null){
                    local = local.right;
                    previousNode = local;
                } else{
                    x = false;
                }
            } else {
                x = false;
            }
        }
        return previousNode.data;
    }

    static public void put(int i){

        Node local = n;
        boolean x = true;
        while (x ){
            if (local.data < i){
                if (local.left != null){
                    local = local.left;
                } else{
                    local.left = new Node(i);
                    x= false;
                }
            }else if (local.data > i){
                if (local.right != null){
                    local = local.right;
                } else{
                    local.right = new Node(i);
                    x= false;
                }
            } else {
                x = false;
            }
        }


    }





    static public int[] solution(int D, int[] A) {
        // write your code in Java SE 8
        n = new Node(A[0]);
        int[] B = A;
        for (int i : A){
            put(i);
        }

        for (int i = 0;i < A.length; i++){
            // B[i] = getPrevious(A[i]);

        }

        return B;

    }


    public static void main(String[] args) {
      // int[] c =  solution(new int[]{0, 2, 7, 3, 5},);
    }



}
