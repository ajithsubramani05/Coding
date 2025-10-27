package org.example;
import java.util.*;
public class neonnumber {
    static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     int m=n*n;
     int c=0;
        while(m>0){
            int d=m%10;
            c+=d;
            m/=10;
        }
        if(c==n){ System.out.print("neon");}
else {System.out.print("non neon");}
    }
}
