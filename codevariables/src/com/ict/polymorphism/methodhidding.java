package com.ict.polymorphism;

public class methodhidding {
    public static void main(String[] args) {
poly111 p1= new poly111();
p1.display("abc");
    }
}


class poly111{
    static void display(String c ){
        System.out.println(" parent name"+ c);
    }

}
class poly22 extends  poly111{
     static  void  display(String c){ //  method hidden-static belong to class only-bind the load to class
        System.out.println(" child name"+ c);
    }
}
// static method cant be override if we do then this concept s known as  method  hidding .