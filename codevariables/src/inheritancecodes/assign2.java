   package inheritancecodes;


    class  AA
    {
        public AA()
        {
            System.out.println("Class A Constructor");
        }
    }

    class BB extends AA
{
        public BB()
        {
        System.out.println("Class B Constructor");
        }
        }

        class CC extends BB
        {
        public CC()
        {
        System.out.println("Class C Constructor");
        }
        }

        public class assign2
        {
        public static void main(String[] args)
        {
        CC c = new CC();
// BB b =new BB();
        }
        }
//-----------------------------------------------------------------------------//
   //------------------assign3-------------------------------------------------//
//class X
//        {
//        public X(int i)
////            public X()
//        {
//        System.out.println(1 );
//        }
//        }
//
//        class p extends X
//        {
//            public p( )/*different parameters of constructor// does not print the output because  constructor call/execute at time of object creation*/        {
//        System.out.println(2);
//        }
//        }
//
//   public class assign2
//   {
//       public static void main(String[] args)
//       {
//           X c = new X (12);
//           p v=new p ();
//
//       }
//   }
//-----------------------------------------------------------------//
   //---------------------------assign4---------------------------------------//
//class X
//{
//    private int m=48;
////    int m=48;
//}
//
//            class Y extends X
//{
//        void methodOfY()
//        {
//        System.out.println(m);// does not access the privaate dATA outside of class.does not access in another class method.
//        }
//        }
