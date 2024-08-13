package org.java;

import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int se = sc.nextInt();
        int[][] matrix = new int[row][col];

        // Read matrix elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == se) {
                    found = true;
                    break;
                }
            }
        }
        if(found)
        { System.out.println("will take number " + se);}
        else {
        System.out.println("no take number " + se);
    }

    }
}

/*
2
2
3
4
5
6
7
no take number 3
 */