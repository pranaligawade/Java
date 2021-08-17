package com.ict.stringdata;
// STRING CLASSES  WITH EQUALS AND ==   //AND  WITHOUT NEW KEYWORD STRING OBJECT CREATION
public class Test2
{
    String s1= "india";
    String s2="india";

    public static void main(String[] args) {
        Test2 t= new Test2();
        System.out.println(t.s1);
        System.out.println(t.s2);
        if (t.s1.equals(t.s2)) { // check the value- compare the content/data.
             System.out.println("correct");
         } else{
             System.out.println("false");
         }
        if (t.s1==t.s2){ // check memory location address
            System.out.println("correct");
        } else{
            System.out.println("false");
        }
       // t.s1="pune";


         t.s2="pune";
      // System.out.println(t.s1);
        if (t.s1==t.s2){// check memory location address
            System.out.println("correct");
        } else{
            System.out.println("false");
        }
        if (t.s1==t.s2){
            System.out.println("correct");
        } else{
            System.out.println("false");
        }
    }
}

