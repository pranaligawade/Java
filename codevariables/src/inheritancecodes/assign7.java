package inheritancecodes;


    class Ap
    {
        int i = 1212;
    }

    class Bp extends Ap
{
        Ap a;

        public Bp(Ap a)
        {
        this.a = a;

        }

        }

        public class assign7
        {
        public static  void main(String[] args)
        {
        Ap a = new Ap();//1212

        Bp b = new Bp(a);//1212

        System.out.println(a.i);//1212

        System.out.println(b.i);//1212

        System.out.println(b.a.i);//1212

        b.a.i = 2121;
        System.out.println("--------");

        System.out.println(a.i);

        System.out.println(b.i);
        }
        }
