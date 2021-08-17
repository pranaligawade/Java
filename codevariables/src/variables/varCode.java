package variables;
public class varCode {
    int sim=10;
    static int pb=30;
    public static void main(String[] args) {

        varCode jk=new varCode();
        System.out.println(jk.sim);
        System.out.println(jk.pb);
        jk.add();
    }
    int add()
    {
        int cc=sim+pb;
        System.out.println("total add values:"+ cc);
         return(cc);
    }
}
