package com.searchingSorting;

public class LinerSearch {
    public static int search(int arr[] , int element){
        for (int i=0; i< arr.length; i++){
            if (element == arr[i]){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40};
        int element = 30;
        int res = search(arr , element);
        System.out.println(element + " found at index : " + res);
    }
}
