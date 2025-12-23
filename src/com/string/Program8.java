package com.string;

import java.util.HashMap;
import java.util.Map;

public class Program8 {
   public static HashMap<Character , Integer> countCharacter(String s1){
       HashMap<Character , Integer> map = new HashMap<>();

       for (int i=0; i<s1.length(); i++){
           char str = s1.charAt(i);

           if (map.containsKey(str)){
               map.put(str , map.get(str) + 1);
           }else{
               map.put(str , 1);
           }
       }

       return map;
   }

    public static void main(String[] args) {
        String s1 = "Malayalam";
        HashMap<Character , Integer> result = countCharacter(s1);

        for (Map.Entry<Character , Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
