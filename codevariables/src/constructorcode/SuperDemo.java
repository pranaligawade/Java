package constructorcode;
//super keyword
public class SuperDemo {
    public static void main(String[] args) {
        SBI sbi=new SBI(12,999);
        sbi.display();
    }
}
class globalbank{
    String bankName="global bank";
}
class Bank extends globalbank{
    String bankName="RBI";
    int bankCode;
    void show(){
        System.out.println("name:"+super.bankName+"code:"+bankCode);
    }
}
class  SBI extends  Bank{
    int phono;
    String bankName="sbi";
    SBI(){
        System.out.println("iam sbi default const");
    }
    SBI(int bcode ,int phn){
        bankCode=bcode;
        phono=phn;
    }
    void  display(){
        System.out.println("name;"+super.bankName+"code':"+bankCode+"phone:"+phono);
    }
}