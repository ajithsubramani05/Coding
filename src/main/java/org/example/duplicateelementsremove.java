package org.example;

import java.util.Scanner;

public class duplicateelementsremove {
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
for(int i=0;i<f.length;i++) {
    if (f[i] >= 2) {
        System.out.println(i+" ");
    }
}
/*
for(int i=0;i<n.length;i++){
for(int j=0;j<n.length;j++){
if(arr[i]==arr[j]){
 System.out.print(i+" ');*/
    }
}
