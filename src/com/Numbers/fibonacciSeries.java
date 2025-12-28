package com.Numbers;

public class fibonacciSeries {
    public static void series(int num){
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i=1; i<=num; i++){
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        int num = 10;
        series(num);
    }
}
