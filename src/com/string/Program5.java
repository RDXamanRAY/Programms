package com.string;

public class Program5 {
    public static boolean isPalindrome(String s1){
        char[] arr = s1.toCharArray();
        int st = 0;
        int end = arr.length-1;

        while (st < end){
            if (arr[st] != arr[end]){
                return false;
            }else{
                st++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "JavaJ";
        boolean res = isPalindrome(s1);
        System.out.println(res);
    }
}
