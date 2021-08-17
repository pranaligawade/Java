package com.ict.abstraction;

public interface vahicalUT {
    public abstract void  run();
    void show();

    // java7
//     void show(){
//
//     }
    //java 8
    default void  add( int x, int y){
        System.out.println(" i amfrom java 8 default method");
//         mul(4,5);
//        divide(4,6);// possible to access it
    }
    static  void  sub  ( int a, int b){
        System.out.println(" i am from java 8 static method");
      //  mul(4,5); // cant access it here
    }
    // java 9
//    private  void divide (int k,int j){
//        System.out.println(" i am from java9 private method");
//       }
//       private   static void mul(int g, int h){
//           System.out.println(" i am from java9 private static method"
//       }
}
class carIFT implements   vahicalUT{
    public  void run(){
        System.out.println(" i am carit");
    }
    public  void show(){
        System.out.println(" iam  show ");

    }

}
class demoItf1{
    public static void main(String[] args) {
        carIF  c1= new carIF();
        c1.run();
        c1.show();
        c1.add(10,20);
        vahicalIt.sub( 10,2);
    }

}

