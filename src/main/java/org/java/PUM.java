package org.java;

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter=1;

        for (int i = 1; i <= n; i++) {
            if(counter % 4 == 0)
            {
                System.out.println(" PUM");
                counter++;
                i--;
                continue;
            }
           System.out.print(counter++ +" " +counter++ +" " +counter++);
        }
        System.out.println(" PUM");
    }
}

/*
7
1 2 3 PUM
5 6 7 PUM
9 10 11 PUM
13 14 15 PUM
17 18 19 PUM
21 22 23 PUM
25 26 27 PUM
 */