//Reverse the given String

package com.string;

public class Program4 {
    public static void reverseString(String s1){
        char ch[] = s1.toCharArray();
        int st = 0;
        int end = ch.length-1;

        while (st < end){
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;
            end--;
        }
        System.out.println(ch);
    }

    public static void main(String[] args) {
        String s1 = "Java";
        reverseString(s1);
    }
}
