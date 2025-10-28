package org.example;

import java.util.Scanner;

public class arrayevenandoddadd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int e=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println( "Even:" +arr[i] + " ");
                e++;
            }
        }
        int o=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {

                System.out.println("Odd :" +arr[i] + " ");
                o++;
            }
        }
        System.out.println(e);
        System.out.println(o);
    }
}