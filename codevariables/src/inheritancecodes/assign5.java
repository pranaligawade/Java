package inheritancecodes;


    class X
    {
//        int m = 10;// output-->10//80
       int m=1111;
        {
            m = m++;

            System.out.println(m);
        }
    }

    class Y extends X
{
        {
        System.out.println(methodOfY());
        }

        int methodOfY()
        {
        return m-- + --m;
        /*m=1111 ->1110
         1110->1109 =>m
         =>1111 + 1109 ---return--->2220 */
        }
        }

        public class assign5
        {
        public static void  main(String[] args)
        {
        Y y = new Y();
        }
        }
