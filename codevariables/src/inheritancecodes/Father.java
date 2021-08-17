package inheritancecodes;
//multipe inheritance
public class Father {
    String fname="amitabh";
    void cooking(){
        System.out.println("am mother ");
    }
}
class  Mother{

    String mname="jaya";
    void cooking(){
        System.out.println("am mother ");
    }
}
//class Chidren extends  Mother,Father {
//    String name ="abishek";
//    Chidren c=new Chidren();
//    c.cooking();// jvm gets an ambiguty to  undersatnd which cookingb metjod need to  call,so to   avoid such scenrio,java does not support this  inheritance.
//}