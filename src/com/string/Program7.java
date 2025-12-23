//Find the occurance of a given character

package com.string;

public class Program7 {
    public static String findOccurance(String s1 , char ch){
        int count = 0;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i) == ch){
                count++;
            }
        }
        return ch + " ---> " + count;
    }

    public static void main(String[] args) {
        String s1 = "java";
        char ch = 'a';
        String res = findOccurance(s1 , ch);
        System.out.println(res);
    }
}
