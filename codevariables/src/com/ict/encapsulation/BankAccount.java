package com.ict.encapsulation;

public class BankAccount {
    private  int accno;
    private  int  custo;
    private String accountType;
   BankAccount(){

   }
    public  BankAccount(int aid){
        this.accno =aid;
    }

    public int getAccno() {
        return accno;
    }

    public int getCusto() { // see the value
        return custo;
    }

// if you not see all value then you remove the setter and getter method


}
 class  bankDemo{
     public static void main(String[] args) {
         BankAccount b1= new BankAccount();

         BankAccount b2= new BankAccount(12344);
         System.out.println(" account id:"+ b2.getAccno());
     }

 }