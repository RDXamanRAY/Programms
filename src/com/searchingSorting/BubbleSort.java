package com.searchingSorting;

public class BubbleSort {

    public static int[] sort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int arr[]){
        for (int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,30,69,11, 2, 3,24};
        int res[] = sort(arr);
        System.out.println(res);
        printArray(arr);
    }
}
