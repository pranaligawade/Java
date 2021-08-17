package inheritancecodes;


class ClassOne
        {
        static int i , j = 191919;

        {
        --i;

        }

        {
        j++;

        }
        }

public class assign8 extends ClassOne

{
    static
    {
        i++;
        System.out.println("i:"+i);
    }

    static
    {
        --j;
        System.out.println("j:"+j);
    }

    public static void main(String[] args)
    {
        System.out.println(i);

        System.out.println(j);
    }
}
