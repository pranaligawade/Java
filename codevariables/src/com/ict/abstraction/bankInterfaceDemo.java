 package com.ict.abstraction;
//extending the interface as wel
// l as implement it
public interface bankInterfaceDemo {
    public  static  final String customerName="amit";  //  constant
    default  void  show(){
        System.out.println(" i am show method");
    }
    void display();
    abstract  void depositAmount();

}
interface AccountInterface1 extends  bankInterfaceDemo {
    public  static  final  int accountid=707; // by default constant
    void show();
    abstract  void display();
    abstract  void getbalance();
}
class accountDemo1 implements   AccountInterface1{

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
class bankdemo{
    public static void main(String[] args) {
        accountDemo ad = new accountDemo();
        ad.show();
    }
}