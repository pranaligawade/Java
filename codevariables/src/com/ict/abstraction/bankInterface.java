package com.ict.abstraction;

import java.io.Serializable;

// mutiple inheritance
 public interface bankInterface {
     public  static  final String customerName="amit";  //  constant
    default  void  show(){
        System.out.println(" i am show method");
    }
    void display();
    abstract  void depositAmount();

}
 interface AccountInterface{
     public  static  final  int accountid=707; // by default constant
    void show();
    abstract  void display();
    abstract  void getbalance();
 }
 class accountDemo implements bankInterface, AccountInterface{

    public  void display(){
        System.out.println("i am accountdemo account display method");
    }
    public void depositAmount(){
        System.out.println("i am accountdemo account  depoite  method");
    }
    public  void getbalance(){
        System.out.println("i am accountdemo account  getbalance method");
    }

     public void show() {
         System.out.println(" i am show  accountdemo");
     }
 }
 class demo{
     public static void main(String[] args) {
         accountDemo ad = new accountDemo();
         ad.show();
     }
 }
// final  class  String extends  Object implements Serializable,Cloneable{
//   best eg of multiple interface provided by  sun microsoft system
// }