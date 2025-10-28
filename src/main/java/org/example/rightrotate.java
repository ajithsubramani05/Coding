package org.example;

import java.util.*;

public class rightrotate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
//        List<Integer> l = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            l.add(arr[i]);
//        }
//        Collections.rotate(l, 3);
//        for (int k : l) {
//            System.out.print(k+" ");
//        }

        int k=2;

        for(int i=k;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int j=0;j<k;j++){
            System.out.print(arr[j]+" ");
        }

    }
}
