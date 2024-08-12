package org.java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
         System.out.println(fact);
        if(fact % 2 != 0)
        {
            System.out.println("NO");
        } else{
            System.out.println("YES");

        }
    }
}
/*
output
120
YES
*/
