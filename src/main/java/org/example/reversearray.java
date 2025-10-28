package org.example;

import java.util.Scanner;

public class reversearray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        for(int i=n-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
        int a = 0;

        int b = n - 1;
        int temp = 0;
        while (a < b) {
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

