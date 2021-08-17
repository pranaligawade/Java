package constructorcode;

 class Student {
//  Integer studId;
  int studId;
  String sname;
  Student(){// default construct
    System.out.println("hello ,i am constructor");
  }
   Student(int a,String snam){//  constructor with argument-parameerized constructor
     studId=a;
    sname=snam;

     System.out.println("studentid:"+studId+"name:"+sname);
   }
  void show(){
    System.out.println("studentid:"+studId+"name:"+sname);
  }
}
   public class Demo{
  public static void main(String[] args) {
//    Student s1=new Student();

//    s1.studId=1;
//    s1.sname="a";// explicitly provide the value-problem occur- increasing code length
//    s1.show();
    Student s1=new Student(1,"pramali");// with argument
    s1.show();
    Student s2=new Student(2,"pp");
    s2.show();
  }
}