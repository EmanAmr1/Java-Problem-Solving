package org.java;

import java.util.Scanner;

//Print YES, if the boys can divide the watermelon into two parts,
// each of them weighing even number of kilos;
// and NO in the opposite case.

public class WaterMelon {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<2)
        {
            System.out.println("NO");
            return;
        }
        if(n%2==0)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }


}
//output:
/*
4
YES
 */