package variables;
// instance variable code
public class javavar {
     int  a=10;// insnctace varible
    // float a;
    public static void main(String[] args) {
        javavar t1=new javavar();
        System.out.println(t1.a);
        t1.a=15;
        System.out.println(t1.a);
        t1. show();
        javavar t2= new javavar();
        System.out.println(t2.a);
        t2.a=34;
        System.out.println(t2.a);
//        t1.show();
//        t2.show();
    }
    public  void show()
    {
        System.out.println(a);
    }
}
