package com.bridgeLabz.PerfectNumber;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class PerfectNumber {
    static Logger logger = Logger.getLogger(PerfectNumber.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("Enter Number : ");
        Scanner sc = new Scanner(System.in);        //Taking user input
        int n = sc.nextInt();

        perfectNumber(n);       //Checking for perfect number
    }

    public static void perfectNumber(int n) {
        int num = n;        //Storing number in num variable
        int sum = 0;        //Initializing sum to zero

        //Iterating till i < n
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {        //Checking for divisors
                sum += i;       //Adding divisors
            }
        }

        //if number is equal to sum of divisors then it is perfect number
        if(sum == num) {
            logger.info(num + " is a perfect number");
        }else {
            logger.info(num + " is not a perfect number");
        }
    }
}
