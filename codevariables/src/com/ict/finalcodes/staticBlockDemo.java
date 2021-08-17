package com.ict.finalcodes;

public class staticBlockDemo {
    int p=20;
    static {
        System.out.println("static block 1 ");
    }
    static {
        System.out.println("i am block 2");
        int a=10;
        int b=10;
    }

    public static void main(String[] args) {
        staticBlockDemo s= new staticBlockDemo();
    }
    {
        System.out.println(" iam instance bloc1");
    }
    static {
        System.out.println(" iam static  block 3");
    }
}
/** key-word static
* order of execution of static block will be  oder of declaration
* load into memory when  your class file load into the jvm
* used initilise static feild of class and dummy object  in unit testing*/
