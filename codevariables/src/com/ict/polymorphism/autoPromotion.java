package com.ict.polymorphism;

public interface autoPromotion {
    public static void main(String[] args) {
        poly p1=new poly();
//        p1.show(10,20);
        p1.show(10f,20);
        p1.show(10,10.0f);
   //    p1.show('abc',10); //error
        p1.show(10,10l);  // second show
//        p1.show(10.00,20);// error
       p1.show(10l,10l);// error befor  double
    }
}
class poly
{
    void show(float b, int c){
        System.out.println( "float/int");
    }
    void show( int c ,float b){
        System.out.println( "int/float");
    }
    void show( double c ,float b){
        System.out.println( "double/float");
    }
}