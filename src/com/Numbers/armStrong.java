package com.Numbers;

public class armStrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int count = 0;
        int n = num ;

        while (n > 0){
            count++;
            n/=10;
        }

        int sum = 0;
        n = num;

        while (n > 0){
            int digit = n % 10;
            int pow = 1;
            for (int i=1; i<=count; i++){
                pow *= digit;
            }
            sum += pow;
            n /= 10;
        }

        if (sum == temp){
            System.out.println(temp + " is ArmStrong Number");
        }else{
            System.out.println(temp + " is not ArmStrong Number");
        }
    }
}
