package org.java;

import java.util.Scanner;

public class SummationFrom1ToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//       long sum = 0;
//        for (int i = 0; i < n; i++) {
//              sum+=i;
//
//        }
        long sum=(n*(n+1)/2);

        System.out.println(sum);
    }

}
/*
3
6
 */