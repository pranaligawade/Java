package com.ict.stringdata;
// string constructor
 public class stringCon {
 String s1= new String()   ;
 String s2 = new String("pune");
 StringBuffer sb1 = new StringBuffer("abc");
  String s3= new String(sb1);
   StringBuffer sb = new StringBuffer("pqr");
    String s4= new String(sb);
     char[ ] ch= { 'i','n','d','i','a'};
     String s5= new String(ch);

    public static void main(String[] args) {
        stringCon sc = new stringCon();
        System.out.println( " value of s1:"+ sc.s1);
        System.out.println( " value of s2:"+ sc.s2);
        System.out.println( " value of s3:"+ sc.s3);
        System.out.println( " value of s4:"+ sc.s4);
        System.out.println( " value of s5:"+ sc.s5);
        System.out.println( " value of  ch:"+ sc.ch);
                    }

 }
