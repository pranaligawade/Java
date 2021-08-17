package classcodes;

public class Animal {
    int a;
    static float b;
    String  color;
    String breed;

    public static void main(String[] args) {
        Animal a=new Animal();
        a.color="red";
        a. a =10;
        a.display(a.color,a.a);
        a.show();
    }
     void display(String color,int a){
         System.out.println("animal"+color+"and age "+a);
         show();
     }
    void  show(){
        System.out.println("color:"+color);

    }

}

