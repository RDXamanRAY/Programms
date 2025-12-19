//Swap the given 2 Strings without using 3rd variable

package com.string;

public class Program2 {
    public static String swap(String s1 , String s2){
        s1 = s1+s2;
        s2 = s1.substring(0 , s1.length()-s2.length());
        s1=  s1.substring(s2.length());

        return "s1 : " + s1 + " , S2 : " + s2;

    }

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        String res = swap(s1 , s2);
        System.out.println(res);
    }
}
