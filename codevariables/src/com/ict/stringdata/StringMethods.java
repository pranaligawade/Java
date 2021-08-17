package com.ict.stringdata;
public class StringMethods {
    public static void main(String[] args) {

         String name1=" Vijay";
         String name2="vijay";
         Object ob;
        //  int strlength= data.length();
         if(name1.equals(name2)){
             System.out.println("same name");
         } else{
             System.out.println("name differnt");
         }
        String result=   name1. replace(  "a",  "v");
        System.out.println(result);
         char [] ch={'i','n'};
        System.out.println(ch);
    }
}
