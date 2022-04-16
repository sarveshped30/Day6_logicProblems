package com.bridgeLabz.CouponNum;

public class CouponNum {
    public static void main(String[] args) {
        //Char array
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max = 100000000;
        int random = (int) (Math.random()*max);
        StringBuffer sb = new StringBuffer();       //Created object of buffer StringBuffer class

        while (random > 0) {
            sb.append(chars[random % chars.length]);        //appending chars elements of array

            random /= chars.length;         //Dividing random number with char length

        }

        String couponCode = sb.toString();
        System.out.println("Coupon Code: "+couponCode);    }
}
