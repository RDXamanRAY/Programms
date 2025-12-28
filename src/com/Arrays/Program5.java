//find maximum element in an array

package com.Arrays;

public class Program5 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
