package variables;
//static variable code

public class javavarSta {
    static int b=15;  //static variable
    int k=20;
    public static void main(String[] args) {

        javavarSta t1= new javavarSta();
//        System.out.println(b); //15
        t1.show(); //15
//        show();    //or javavarsta.show();
        t1.b=25; //25
        javavarSta t2= new javavarSta();
        t2.show(); //15 //25

    }
    public void show()
    {
        System.out.println(b);


    }
//    public  static void show()
//    {
//        System.out.println(b);
//
//    }
}
