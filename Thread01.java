class A extends Thread
{
public A(String s)
{
super();
}
public void run()
{
for(int i=1;i<=15;i++)
{
System.out.println(getName());
}
}
}
class Thread01
{
public static void main(String args[])
{
A a1=new A("Mentor");
A a2=new A("Computer");
A a3=new A("Education");
a1.start();
a2.start();
a3.start();
System.out.println("Hello!!!!");
}
}
