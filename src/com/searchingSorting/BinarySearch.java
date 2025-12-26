package com.searchingSorting;

public class BinarySearch {
    public static boolean search(int arr[] , int element){
        boolean result = false;
        int lb = 0;
        int ub = arr.length-1;
        int mid = (lb + ub) / 2;

        if (element == arr[mid]){
            result = true;
        }else{
            for (int i=0; i< arr.length; i++){
                if (element == arr[mid]){
                    result = true;
                    break;
                } else if (element >= arr[mid]) {
                    lb = mid+1;
                } else {
                    ub = mid-1;
                }
                mid = (lb+ub) /2 ;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        boolean res = search(arr , 40);
        System.out.println(res);
    }
}
