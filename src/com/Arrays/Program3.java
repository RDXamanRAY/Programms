//reverse of an given array

package com.Arrays;

import java.util.Arrays;

public class Program3 {
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        int st = 0;
        int end = arr.length-1;
        while (st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
