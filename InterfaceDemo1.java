interface Father
   {
    double property=10000;
    double height=5.6;
   }

interface Mother
   {
     double property=30000;
     double height=5.4;
   }

class myclass implements Father,Mother
      {
        void show()
            {
              System.out.println("total property is="+(Father.property+Mother.property));
              System.out.println("total height is="+(Father.height+Mother.height));
            }
      }

class InterfaceDemo1
      {
         public static void main(String args[])
           {
             myclass ob=new myclass();
             ob.show();
           }
       }