//print even number from array

package com.Arrays;

public class Program2 {
        public static void main(String[] args) {
            int arr[] = {10,20,30,23,79};
            for (int i=0; i<arr.length; i++){
                if (i % 2 == 0){
                    System.out.print(arr[i] +" ");
                }
            }
        }
    }

