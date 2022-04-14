package com.bridgeLabz.primeNumber;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class PrimeNumber {
    static Logger logger = Logger.getLogger(PrimeNumber.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int status = 1;

        if(num == 0 || num == 1) {
            logger.info("It is not a prime number");
        }else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    status = 0;
                    break;
                }
            }
            if(status == 1) {
                logger.info("It is prime number");
            }else {
                logger.info("it is not a prime number");
            }
        }
    }
}
