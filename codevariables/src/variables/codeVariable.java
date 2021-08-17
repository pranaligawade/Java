package variables;

public class codeVariable {
    int ap=10;
    static int pb=30;
    public static void main(String[] args) {
         codeVariable pp= new codeVariable();
        System.out.println(pp.ap);
        System.out.println(pp.pb);
        pp.ap=200;
        System.out.println(pp.ap);
        pb=300;
        codeVariable apb= new codeVariable();
        System.out.println(apb.ap);
        System.out.println(apb.pb);

    }
}
