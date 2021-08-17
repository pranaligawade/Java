package inheritancecodes;

class A
{
    int[] a = new int[5];

    {
        a[0] = 10;
    }
}

public class assign9 extends A
{
    {
        a = new int[5];
    }

    {
        System.out.println(a[0]);
    }

    public static void main(String[] args)
    {
        assign9 main = new assign9();
    }
}
