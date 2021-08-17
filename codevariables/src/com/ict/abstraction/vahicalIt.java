package com.ict.abstraction;

public interface vahicalIt {
     public abstract void  run();
     void show();
    // java7
//     void show(){
//
//     }
     //java 8
     default void  add( int x, int y){
         System.out.println(" i amfrom java 8 default method");
    }
    static  void  sub  ( int a, int b){
        System.out.println(" i am from java 8 static method");
    }
    // java 9
    //private  void divide (int k,int j){
    //    System.out.println(" i am from java9 private method");
  //   }
}
class carIF implements   vahicalIt{
     public  void run(){
          System.out.println(" i am carit");
     }
     public  void show(){
          System.out.println(" iam  show ");

     }

}
 class demoItf{
      public static void main(String[] args) {
           carIF  c1= new carIF();
           c1.run();
           c1.show();
           c1.add(10,20);
           vahicalIt.sub( 10,2);
      }

 }
