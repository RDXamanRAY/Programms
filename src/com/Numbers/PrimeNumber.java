package com.Numbers;

public class PrimeNumber {
    public static boolean isPrime(int num){
        for (int i=2; i<num/2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int num = 24;
        if (isPrime(num)){
            System.out.println(num + " is Prime number");
        }else{
            System.out.println(num + " is not Prime number");
        }
    }
}
