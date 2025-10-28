package org.example;

import java.util.Scanner;

public class missingelement {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []f=new int[101];
        for(int i=0;i<n;i++){
            f[arr[i]]++;
        }
        for(int i=1;i<f.length;i++) {
            if (f[i] ==0) {
                System.out.println(i);
                break;
            }
        }
    }
}
