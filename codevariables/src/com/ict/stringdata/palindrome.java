package com.ict.stringdata;

public class palindrome {
    public static void main(String[] args) {
        String number="101";
        StringBuffer sb = new StringBuffer(number);
        System.out.println( "sb value:"+sb);
        StringBuffer sb1= sb.reverse();
        System.out.println( "sb value:"+sb1);
        String revNumber=new String(sb1);
        if (sb.equals(sb1)){
            System.out.println("correct palindrom");
        }else{
            System.out.println("correct not palindrom");
        }
    }
//
// output correct because sting buffer are not in that but it reffer the equals method of object class ,
// so sb= sb1 both cheaking memory address address thats way it correct before conveting string to the buffer class : String revNumber=new String(sb1);

}
