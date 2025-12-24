package com.string;

public class Program10 {
    public static void main(String[] args) {
        String s1 = "programming";
        String str = "";

        for (int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if (str.indexOf(ch) == -1){
                str += ch;
            }
        }

        System.out.println(str);
    }
}
