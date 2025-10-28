package org.example;

import java.util.Scanner;

public class keyfoundornot {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
//        for(int i=0;i<n;i++) {
//        if(arr[i]==k) {System.out.print("found "); return;}
//        else{ System.out.print("Not found ");return;}
        boolean s=false;
        for(int i=0;i<n;i++) {
            if(arr[i]==k){
                s=true;
              break;
            }
        }
        if(s){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }}

