
package inheritancecodes;
//hierachiacal inheritance
public class Account {
    int acno=887;
    int custoID=181;
    String custName="pranali";
    String pan="bor01223";
    void deposite(){
        System.out.println(" iam form deposite");
    }
    void withdraw()

    {
        System.out.println(" iam form withdraw method");
    }
}
class jabdhanAccount extends Account{
    public static void main(String[] args) {
        jabdhanAccount j=new jabdhanAccount();
        System.out.println("account n0:"+j.acno+"customaer name:"+j.custName);
        j.deposite();
    }
}
class  SavingAccount extends Account{
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount();
        System.out.println("iam form Saving account");
        System.out.println("account n0:"+s.acno+"customaer name:"+s.custName);
        s.deposite();
}

}
class  CurrentAccount extends   Account{
    public static void main(String[] args) {
        CurrentAccount P= new CurrentAccount();
        System.out.println("iam form Saving account");
        System.out.println("account n0:"+P.acno+"customaer name:"+P.custName);
        P.deposite();
    }

}