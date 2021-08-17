package com.ict.polymorphism;

public class overridenReuturntype {
    public static void main(String[] args) {
 poly1111 p1= new poly1111();
 p1.display("abc");
//        poly1111 p2= new poly222();
//        /* *is vaild;-initilation and instance   of the poly222 class then poly222 execute
//        it only posssible in inheritance.*/
//        p2.display("abc");
//        poly222 p2= new poly1111() ; error :-//not vaild because child not hold parent  class object
//        p2.display("abc");
    }
    
}


class poly1111{
    Object  display(String c ){
        System.out.println(" parent name"+ c);
        return null;
    }

}
class poly222 extends  poly1111{
    String  display(String c){
        System.out.println(" child name"+ c);
        return null;
    }
}
class poly11111{
    Object  display(String c ){//:-parent-child relationship e.g refer poly 1111 and poly 2222
//        String  display(String c ){// not vaild because same potision in heirachy poly222 and 11111
        System.out.println(" parent name"+ c);
        return null;
    }

}
class poly2222 extends  poly11111{
    StringBuffer  display(String c){ //:-parent-child relationship e.g refer poly 11111 and poly 2222
//        String display(String c){ // not vaild because same potision in heirachy eg.ref-poly2222 and 11111
        System.out.println(" child name"+ c);
        return null;
    }
}


