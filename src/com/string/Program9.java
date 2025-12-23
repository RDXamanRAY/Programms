//find the occurance of subString

package com.string;

public class Program9 {
    public static void findOccurance(String s1){
        String str[] = s1.split(" ");
        for (int i=0; i<str.length; i++){
            int count = 1;
            for (int j=i+1; j<str.length; j++){
                if (str[i].equals(str[j]) && str[i]!=" "){
                    count++;
                    str[j] = " ";
                }
            }
            if (str[i]!=" "){
                System.out.println(str[i] + " : " + count);
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "Hello java Hello";
        findOccurance(s1);
    }
}
