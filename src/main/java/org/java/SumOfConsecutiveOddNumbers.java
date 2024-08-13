package org.java;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum=0;
            int val1 = in.nextInt();
            int val2 = in.nextInt();
            int max = Math.max(val1, val2);
            int min = Math.min(val1, val2);
            for(int j = min+1; j < max; j++){
                if(j%2 != 0){
                         sum += j;
                }
            }
             System.out.println(sum);
        }

    }
}
/*
n=3
5
6
sum=0
10
4
sum=21
4
9
sum=12

 */