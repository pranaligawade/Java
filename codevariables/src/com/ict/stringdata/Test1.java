package com.ict.stringdata;
// STRING CLASSES
public class Test1 {
    String s="india";// memory allocated

    public static void main(String[] args) {
        Test1 t1= new Test1();
        System.out.println("value of s:"+t1.s);
        t1.s.concat("asia");//string is immutable so value does not change// value genrated as 'indiaasia' but s= india remain same here
        System.out.println("value of s:"+t1.s);
        t1.s=  t1.s.concat("asia");  //  new object will be created  in memory and pointhing to india-aisa

        System.out.println("value of s:"+t1.s);
    }
}
