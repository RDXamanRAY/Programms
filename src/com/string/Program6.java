//Reverse the given String words along with the sentence also
package com.string;

public class Program6 {
    public static String reverseString(String s1){
        String[] arr = s1.split(" ");
        String rev = "";

        for (int i= arr.length-1; i>=0; i--){
            rev += arr[i]+" ";
        }

        return rev;
    }

    public static void main(String[] args) {
        String s1 = "java ia OOPS language";
        String res = reverseString(s1);
        System.out.println(res);
    }
}
