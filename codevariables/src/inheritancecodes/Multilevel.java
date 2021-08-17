package inheritancecodes;

public class Multilevel {
    //parent class
    int i=10;
    String name="pb";
    private String schoolname="xyz";
    static  int a=30;
   static void show()
    {
        System.out.println("i am from parent show");
    }
    private  void display(){
        System.out.println("parent display method");
    }
}
class Anotherparent extends  Multilevel{
    float p=5.3f;
    double d=20.15;
    void test(){
        System.out.println("i am another parent");
    }

}
class child1 extends  Anotherparent{
    public static void main(String[] args) {
        child1 c1= new child1();
        show();

        System.out.println("value of i:"+c1.i);
        System.out.println("value of name:"+c1.name);
        System.out.println("value of a:"+a);
        System.out.println("===============================================");
        System.out.println("value of K:"+c1.p);
        System.out.println("value of D:"+c1.d);
        c1.test();
    }
}
