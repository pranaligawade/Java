package inheritancecodes;


    class Aaa
    {
        static String s = "AAA";

        static
        {
            s = s + "BBB";
        }

        {
            s = "AAABBB";// print
        }
    }

    class Bbb extends Aaa
{
    static
          {
            s = s + "BBBAAA";
//              System.out.println(s);// static block value printed
            }

            {
            System.out.println(s);// instance block value are printed
            }
            }

            public class assign6
            {
            public static void main(String[] args)
            {
            Bbb b = new Bbb();
            }
            }
