package org.java;

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //20
        int value1 = sc.nextInt(); //2
        int value2 = sc.nextInt(); //5
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if(i/10==0) //from 1 to 9   take 2+3+4+5=14
            {
                if (i >= value1 && i <= value2) {
                    sum += i;
                }
            }

            else {         // For numbers 10 and above      // take  11 +12+ 13+ 14+20=70
                    int number = i;
                    int mysum = 0;
                    while (number != 0) {
                        int fraction = number % 10;
                        mysum += fraction;
                        number /= 10;
                    }
                    if (mysum >= value1 && mysum <= value2) {
                        sum += i;
                    }
                }
            }

            System.out.println(sum);
            }
        }


/*
20
2
5
84
 */
