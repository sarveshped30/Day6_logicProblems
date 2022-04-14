package com.bridgeLabz.fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.println("Enter n number in series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //Total numbers in series to print

        System.out.print(n1 + " " + n2);     //Printing 0 and 1

        int count = n - 2;      //Because 0 and 1 already printed

        while(count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);

            count--;
        }
    }
}
