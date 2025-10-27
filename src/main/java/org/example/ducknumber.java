package org.example;

import java.util.Scanner;

public class ducknumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        if(s.charAt(0)!='0'){
            System.out.print("duck");
        }
        else {
            System.out.print("not duck");
        }

}
}
