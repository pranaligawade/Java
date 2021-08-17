package com.ict.stringdata;
//HOW TO CREATE A CUSTOM IMMUTABLE CLASS IN JAVA

import com.sun.xml.internal.ws.api.pipe.Engine;

public  final  class IMCar {
    private final  String color;
    private  final  int noOfppl;
    private  final Engine1 engine;

    public String getColor() {
        return color;
    }

    public int getNoOfppl() {
        return noOfppl;
    }

    public Engine1 getEngine() {
        return engine;
    }
//   private IMCar(){    }

    public IMCar(String c, int number , Engine1 e){
         this.color=c;
         this.noOfppl=number;
        // this.engine=e;// shallow cloning// directy  copy of refernce and value
         Engine1 e1= new Engine1();//deep cloning-copy the value but does not copy reference
         e1.capacity=e.capacity;//deep cloning-copy the value but does not copy reference
         this.engine=e1;

    }

}
class Engine1{
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    int  capacity=800;
}
class  IMDemo{
    public static void main(String[] args) {
        Engine1 e =new Engine1();
        //e. setCapacity(900);
        IMCar c  = new IMCar( "red",5,e);
        e. setCapacity(900); // not immitable -does not change state( value)// shallow cloning-hasrelationship
        System.out.println( "value"+ c.getColor()+"noOfppl"+c.getNoOfppl()+"capacity"+c.getEngine().getCapacity());
        System.out.println( "engine capacity"+e.getCapacity());
    }
}