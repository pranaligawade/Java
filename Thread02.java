class A implements Runnable
{
public void run()
{
for(int i=1;i<=15;i++)
{
System.out.println(Thread.currentThread());
}
}
}
class Thread02
{
public static void main(String args[])
{
A a=new A();
Thread t1=new Thread(a,"Mentor");
Thread t2=new Thread(a,"computer");
Thread t3=new Thread(a,"Education");
t1.start();
t2.start();
t3.start();
}
}
