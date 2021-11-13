package com.codechef;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*
        Given the list of numbers, you are to sort them in non decreasing order.
        Input
        t – the number of numbers in list, then t lines follow [t <= 10^6].
        Each line contains one integer: N [0 <= N <= 10^6]

        Output
        Output given numbers in non decreasing order.
        Example
        Input:

        5
        5
        3
        6
        7
        1
        Output:
        1
        3
        5
        6
        7
         */
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();
    int[] arr = new int[t];
    for(int i=0;i<t;i++){
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}