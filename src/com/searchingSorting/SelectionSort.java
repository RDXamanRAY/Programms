package com.searchingSorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int arr[]){
        for (int i=0; i<arr.length; i++){
            int ind = i;
            for (int j=i+1; j<arr.length;j++){
                if (arr[j] < arr[ind]){
                    ind = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {12 , 76 , 44 , 98 , 2 , 8};
        int res[] = sort(arr);
        System.out.println(Arrays.toString(res));
    }
}
