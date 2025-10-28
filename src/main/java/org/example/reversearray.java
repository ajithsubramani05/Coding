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

        reverse(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr) {
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}