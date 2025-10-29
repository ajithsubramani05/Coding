package org.example;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
//void add_last( ){
//
//}
public class linkedlist {
    static void main(String[] args) {
        node p1=new node(100);
        node p2=new node(200);
        node p3=new node(300);
        node p4=new node(400);
        node p5=new node(500);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;

        node head=p1;
        node current =head;
        while(current !=null)
        {
            System.out.print(current.data+" ");
            current =current.next;
        }
    }
}
//        System.out.println(p3.next);
//        System.out.println(p2.data);
//        System.out.println(p3.data);
//        System.out.println(p4.data);
//        System.out.println(p5.data);
//        System.out.println(p4);