package com.ict.modifiers;
 class mod1{
     public int a=10;
     protected int b=20;
     int c=30;
     private  int d=20;
     void show(){
         System.out.println("value a:"+a);
         System.out.println("value a:"+b);
         System.out.println("value a:"+c);
         System.out.println("value a:"+d);
     }
     protected class test{
         int k=1;
     }
 }
public class modifiers { protected int  ck=20;
//    public static void main(String[] args) {
//
//        mod1 m1= new mod1();
//        System.out.println("value a:"+m1.a);
//        System.out.println("value a:"+m1.b);
//        System.out.println("value a:"+m1.c);
//        //System.out.println("value a:"+m1.d);//private cannt be accisable the out side of class
//
////        m1.show();
//    }
}
class mod2 extends  modifiers{
    public static void main(String[] args) {
        mod1 m1= new mod1();
        System.out.println("value a:"+m1.a);
   }
}
