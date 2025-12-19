//reverse the words in a given String

package com.string;

public class Program5 {

    public static String reverseString(String s1){
        String[] str = s1.split(" ");
        String rev= "";

        for (int i=0; i<str.length; i++){
            String temp = str[i];
            for (int j=temp.length()-1; j>=0; j--){
                rev += temp.charAt(j);
            }
            rev += " ";
        }

        return rev.trim();
    }

    public static void main(String[] args) {
       String s1 = "Java is an OOPS Language";
       String res = reverseString(s1);
       System.out.println(res);
    }
}
