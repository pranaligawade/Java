package conditionalstatment;

public class nestedifcode {
    public static void main(String[] args) {
        int leapyear=2022;
        if(leapyear%4==0){
            if(leapyear%100==0){
                if (leapyear%400==0){
                    System.out.println(  " a leap year");
                }

            }
        }else{
            System.out.println(  "not a leap year");
        }
    }
}
