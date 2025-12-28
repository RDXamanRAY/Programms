package com.Numbers;

public class DecimalToBinary {
    public static String convert(int decimal){
        String binary = "";

        while (decimal > 0){
            int rem = decimal % 2;
            binary += rem;
            decimal /=  2;
        }
        return binary;
    }

    public static void main(String[] args) {
        int decimal = 44;
        String res = convert(decimal);
        System.out.println(res);
    }
}
