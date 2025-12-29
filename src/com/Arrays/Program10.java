//Zig Zag Array

package com.Arrays;

import java.util.Arrays;

public class Program10 {
    public static void main(String[] args) {
        int arr1[] = {10,20,30};
        int arr2[] = {40,50,60};
        int newArr[] = new int[arr1.length + arr2.length];
        int i=0 , j=0, k=0;
        for ( i=0; i< newArr.length; i++){
            if (j<arr1.length){
                newArr[i++] = arr1[j++];
            }
            if (k< arr2.length){
                newArr[i++] = arr2[k++];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
