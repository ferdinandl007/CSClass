package com.company;

public class Main {
    static int[] nums = {738, 570, 687, 111, 530, 966, 524, 382, 701, 842, 348, 22, 658, 220, 817};

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < nums.length; i++){
            System.out.println(calc(nums[i]));
        }
    }



    static int calc(int num){
        //num = (num % 19);
        num = ((num*7)%18) +1;
        return num;
    }
}
