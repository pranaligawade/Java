package com.ict.encapsulation;

public class bankacccountDemo {
    private  int accno;
    private  int  custo;
    private String accountType;
    bankacccountDemo(){

    }
    public bankacccountDemo(int aid){
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
class  bankDemoo{
    public static void main(String[] args) {
        bankacccountDemo b1= new bankacccountDemo();


        bankacccountDemo b2= new bankacccountDemo(12344);
        System.out.println(" account id:"+ b2.getAccno());
    }
}

