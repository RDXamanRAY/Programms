package com.Arrays;

import java.util.Arrays;

public class Program9 {
    public static void main(String[] args) {
        int arr1[] = {10,20,30};
        int arr2[] = {40,50,60};
        int newArr[] = new int[arr1.length + arr2.length];
        int j=0;

        for (int i=0; i< newArr.length; i++){
            if (i < arr1.length){
                newArr[i] = arr1[i];
            }else{
                newArr[i] = arr2[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
