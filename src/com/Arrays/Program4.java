//Given charatcer array is Palindrome or not

package com.Arrays;

public class Program4 {
    public static String isPalindrome(char[] arr){
        int st = 0;
        int end = arr.length-1;

        while (st < end){
            if (arr[st] != arr[end]){
              return  "Given character are not plaindrome";
            }else{
                st++;
                end--;
            }
        }
        return "Given character are  plaindrome";
    }

    public static void main(String[] args) {
        char[] arr = {'m' , 'a' , 'm'};
        String res = isPalindrome(arr);
        System.out.println(res);
    }
}
