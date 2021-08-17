package com.ict.finalcodes;
   class finalmet1{
      int a=20;
      final void show(){
          System.out.println("vale of final1class"+ a);
      }
  }
class finalmet2 extends  finalmet1{

//    void show(){// final meethod does not override
//        System.out.println("vale of final1class"+ a);
//    }
}public class finalMethodDemo {
    public static void main(String[] args) {
        finalmet1 f1= new finalmet1();
        f1.show();
    }
}

// note- if you don`t want  allow the overriden of yor parent class method then declare your parent class method  as a  final.