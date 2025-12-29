//find the occurance of each element in array

package com.Arrays;

public class Program11 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,20,30,40,10,40};
        for (int i=0; i<arr.length; i++){
            int count = 1;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    arr[j] = Integer.MAX_VALUE;
                    count++;
                }
            }
            if (count >= 1 && arr[i] != Integer.MAX_VALUE){
                System.out.println(arr[i] + "---->" + count);
            }
        }
    }
}
