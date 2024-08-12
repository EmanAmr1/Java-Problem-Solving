package org.java;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            int s = in.nextInt();
            while (s != 0)
            {
                int fraction = s % 10;
                System.out.print(fraction + " ");
                s = s / 10;
            }
            System.out.println();
        }
    }
}
/*
2
        548
        8 4 5
        987
        7 8 9
*/