package org.example;
class Ece{
    void dep(){
        System.out.println("ECE DeP");
    }
}
class Cse extends Ece{
    void de(){
        System.out.println("CSE DeP");
    }
}
public class Encapsulation {
    static void main(String[] args) {
        Cse std = new Cse();
        std.de();

    }
}
