package classcodes;

public class TestDemo{
    int a=10;
    static int b =20;

    public static void main(String[] args) {// method
                System.out.println("good morning");
    }
    TestDemo(){
        //constructor
        System.out.println( "constructor");

    }
    {
        //instance block
        System.out.println("i am instace block");
    }
    static {
        //static block
        System.out.println(" i am a static block");
    }
    class  Test{
     //nested class
    }
}
