//abstract classDemo
abstract class figure
    {
      double dim1;
      double dim2;

      figure(double a,double b)
          {
            dim1=a;
            dim2=b;
          }

      abstract double area();
   }

class Rectangle extends figure
     {
      Rectangle(double a,double b) 
         {
           super(a,b);
         }

     double area()
       {
         System.out.println("inside area of rectangle");
         return(dim1*dim2);
       }
    }

class AbstractDemo
      {
       public static void main(String args[])
          {
            //figure f=new figure(10,10);//Illegal 

              Rectangle r=new Rectangle(9.5,2.5);
              System.out.println("area is="+r.area());
          }
}