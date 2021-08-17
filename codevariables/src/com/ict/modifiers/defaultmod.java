package com.ict.modifiers;


class mod11{
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
}
 class mod22 extends mod11 {
        int e=30;
    }

public class defaultmod extends mod11{
    public static void main(String[] args) {
        mod1 m1= new mod1();
        System.out.println("value a:"+m1.c);
        defaultmod mf1=new defaultmod();
        System.out.println(mf1.a);
    }
}
