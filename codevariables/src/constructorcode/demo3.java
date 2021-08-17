package constructorcode;

//this keyword
public class demo3 {
    public static void main(String[] args) {
        test t1=new test();
        t1.show(30);
        t1.dislplay();
    }

}
class test{
    int k=10;

    void show(int k){//local var
        this.
                k=k;
        System.out.println("value of k:"+k);//loc var
//        System.out.println("value of k:"+this.k);//instance
//        this.add();
    }
    void dislplay(){

        System.out.println("value of kk:"+k);
    }
}