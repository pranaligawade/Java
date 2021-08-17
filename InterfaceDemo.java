// interfaceDemo
interface shape
{
void area();
void volume();

double pi=3.14;
}
class circle implements shape
{
double r;
circle (double radiues)
{
r=radiues;
}
public void area()
{
System.out.println("area of circle="+(pi*r*r));
}
public void volume()
{
System.out.println("volume of circle is="+(2*pi*r));
}
}
class InterfaceDemo
{
public static void main(String args[])
{
circle ob=new circle(10.5);
ob.area();
ob.volume();
}
}
