package com.string;

//find the length of given String without using inBuilt methods

public class Program1 {
    public static void main(String[] args) {
        String s1 = "Java";
        char[] ch = s1.toCharArray();
        int count = 0;
        for (char c : ch){
            count++;
        }
        System.out.println(count);
    }
}
