//remove the duplicate elements from array

package com.Arrays;

import java.util.Arrays;

public class Program8 {
    public static int[] removeDuplicate(int arr[]){
        int count  = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j] && arr[i]!= Integer.MAX_VALUE){
                    count++;
                    arr[j] = Integer.MAX_VALUE;
                }
            }
        }
        int newArr[] = new int[arr.length - count];
        int j = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] != Integer.MAX_VALUE){
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {10 , 20, 30, 30 , 40};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
}
