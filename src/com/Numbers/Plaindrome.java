package com.Numbers;

public class Plaindrome {
    public static String   isPlaindrome(int num){
        int rev = 0;
        int number = num;

        while (num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (rev == number)
            return number + " is Palindrome";
        else
            return number + " is not palindrome";
    }

    public static void main(String[] args) {
        int num = 121;
        String res = isPlaindrome(num);
        System.out.println(res);
    }
}
