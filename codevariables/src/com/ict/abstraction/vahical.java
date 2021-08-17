package com.ict.abstraction;

public abstract class vahical {// pure abstract class
    int numberOfTyres;
     abstract void run(); // aslo pure class
    void show(){
        // partial abstract class
        System.out.println(" i am  concrete method");
    }
}
class Car  extends  vahical{
    int numberOfTyres=4;
    void run() {

        System.out.println(" i am run method of car");
    }
}
class  Schooter extends vahical{
    int numberOfTyres=2;
    void run() {

        System.out.println(" i am run method of scooter");
    }
}
class vahicalDemo{
    public static void main(String[] args) {
       vahical v1= new  Car() ;// parent class reference can hold the child class object
        Car c1= new Car();
        c1.run();
        c1.show();
        Schooter s1= new Schooter();
        s1.run();
        System.out.println( " number of type:"+ c1.numberOfTyres);
        System.out.println( " number of type:"+ s1.numberOfTyres);
    }
}
