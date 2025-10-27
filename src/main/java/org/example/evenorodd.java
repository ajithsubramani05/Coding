package org.example;
import java.util.*;
public class evenorodd {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            if(n%5==0 && n%3==0 && n%7==0){System.out.print("Yes");return;}
            else {System.out.print("No");}
        }
}
