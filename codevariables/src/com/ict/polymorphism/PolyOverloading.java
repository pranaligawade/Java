package com.ict.polymorphism;
//method overload also cALLED/complier time pm/static pm
// method name same but argument different// method inside  same class
// arg different:-type arg different// diff sequence of arg//no of arg diff
public class PolyOverloading {
    public static void main(String[] args) {
     poly1 p1=new poly1()  ;
     p1.show();
     p1.show(10,"riya");
    }
}
class poly1{

    void show(){
        System.out.println("i am from JUST SHOW");
    }
    void show( int a){    // overloaded method
        System.out.println("i am from  one");
    }
    void show( int a ,String b){ // overloading method// different type and  no of arg
        System.out.println("i am from  different type SHOW");
    }
    void show(String a,  int b ){ // sequence of arg
        System.out.println("i am from  sequence of agru different SHOW");
    }
}