package inheritancecodes;

 public  class SingleLevel {
    //parent class
    int i=10;
    String name="pb";
    private String schoolname="xyz";
    static  int a=30;
    void show()
     {
         System.out.println("i am from parent show");
     }
     private  void display(){
         System.out.println("parent display method");
     }
}
class child extends SingleLevel{
    public static void main(String[] args) {
        child c1= new child();
        c1.show();
        System.out.println("value of i:"+c1.i);
        System.out.println("value of name:"+c1.name);
        System.out.println("value of a:"+a);
    }
}
