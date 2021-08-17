package constructorcode;

public interface SuperFunDemo {

    public static void main(String[] args) {
//        SBI1 sbil=new SBI1();
        SBI1 sbi=new SBI1(123,999);
        sbi.display();
    }
}
class globalbank1{
    String bankName="global bank";
}
class Bank1 extends globalbank1{
    String bankName="RBI";
    int bankCode;
    Bank1(){
        System.out.println("bank-default constructor with a zero  arg ");
    }
    Bank1(int k){
        System.out.println("bank- paramertries constructor");
    }
    void show(){
        System.out.println("name:"+super.bankName+" & code:"+bankCode);
    }
}
class  SBI1 extends  Bank1{
    int phono;
    String bankName="sbi";
    SBI1(){
        super(10);
        System.out.println("iam sbi default const");
    }
    SBI1(int bcode ,int phn){
        super(10);
        bankCode=bcode;
        phono=phn;
    }
    void  display(){
        System.out.println(" bank name:"+super.bankName+" & code:"+bankCode+"& phone:"+phono);
    }
}