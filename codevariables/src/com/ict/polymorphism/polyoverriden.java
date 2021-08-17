package com.ict.polymorphism;

public class polyoverriden {
    public static void main(String[] args) {
        poly11 p1= new poly11();
        p1.display("abc",10);
    }
}
class poly11{
    void display(String c ,int a){  // overridden mthod
        System.out.println(" parent name"+ c);
    }
}
class poly2 extends  poly11{
    void  display(String c, int a){ // overrriding method
        System.out.println(" child name"+ c);
    }
}