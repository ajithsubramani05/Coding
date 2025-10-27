package org.example;
import java.util.*;
public class leapyear {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0 || n%100==0 && n%400==0){
            System.out.print("Leap Year");
        }
        else{
            System.out.print("No leap Year");
        }
    }
}
