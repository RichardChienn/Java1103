package com.ocp3;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] score =new int[]{100,90,80};
        score = new int[]{50,60,70};
        System.out.println("列出成績");
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.print("總分=>");
        int sum =0;
        for (int i = 0; i < score.length; i++) {
           sum +=score[i]; 
        }
            System.out.println(sum);
    }
}
