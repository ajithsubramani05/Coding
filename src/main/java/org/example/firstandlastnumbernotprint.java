package org.example;

import java.util.Scanner;

public class firstandlastnumbernotprint
{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int s=0;
        for(int i=1;i<n-1;i++){
            s=arr[i];
            System.out.println(s);
        }
    }
}
