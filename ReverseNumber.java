package com.bridgeLabz.ReverseNumber;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class ReverseNumber {
    static Logger logger = Logger.getLogger(ReverseNumber.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("Enter Number : ");
        Scanner N = new Scanner(System.in);
        int Num = N.nextInt();
        int reverse = 0;
        int remainder = 0;

        for(;Num != 0; Num = Num/10) {
            remainder = Num%10;
            reverse = reverse*10 + remainder;
        }
        logger.info("Reverse Number is " + reverse);
    }
}
