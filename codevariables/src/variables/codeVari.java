package variables;

public class codeVari {
    float as=34;
    static  float ty=12;
    public static void main(String[] args) {
        codeVari a= new codeVari();
        System.out.println(a.as);
        System.out.println(a.ty);
        a.as=45;
        ty=400;
        codeVari b= new codeVari();
        System.out.println(b.ty);
//        b.as=a.as;
        System.out.println(a.as);
        System.out.println(b.as);
        b.getTy();
    }

    float getTy() {
       float tp=ty;
//        System.out.println(tp);
//        return tp;
      System.out.println(tp+as);
       return tp+as;
//        System.out.println("values:"+ tp*as+ty);
//       return tp*as+ty;

    }
}
