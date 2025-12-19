//count alphabet , count numbers , count special charcters present in  a given Strings

package com.string;

public class Program3 {
    public static String countString(String s1){
        int alphaCount = 0;
        int numCount = 0;
        int specialCount = 0;

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                alphaCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            }else{
                specialCount++;
            }
        }
        return "Alphabet : " + alphaCount +
                " , Numbers : " + numCount +
                " , Special Characters : " + specialCount;
    }

    public static void main(String[] args) {
        String s1 = "Java123@code#$%";
        String res = countString(s1);
        System.out.println(res);
    }
}
