package com.Numbers;

public class BinaryToDecimal {
    public static int convert(int binary){
        int decimal = 0;
        int power = 0;

        while (binary != 0){
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2,power);
            power++;
            binary /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        int binary = 110110;
        int res = convert(binary);
        System.out.println(res);
    }
}
