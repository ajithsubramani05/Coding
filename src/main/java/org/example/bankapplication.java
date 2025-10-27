package org.example;
import java.util.*;
public class bankapplication {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double n=sc.nextDouble();
        if(n>0 && n%2==0)System.out.print("Approved : Even Amount");
        else if(n<0)System.out.print("Refund Required");
        else if(n>0 &&n%2!=0)System.out.print("Approved : Odd Amount");
    else System.out.print("No Tranactions");
    }
}
