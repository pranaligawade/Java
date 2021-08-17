package com.ict.stringdata;
 // which is good to stored the passsword   string/char
public class PassStringCharDemo {
      // String s1= new String()   ;
        String s2 = new String("pune");
        StringBuffer sb1 = new StringBuffer("abc");
        String s3= new String(sb1);
     //  StringBuffer sb = new StringBuffer("pqr");//optionalcommenting
     //   String s4= new String(sb);
        char[ ] ch= { 'i','n','d','i','a'};
        String s5= new String(ch);

        public static void main(String[] args) {
            PassStringCharDemo pc =new PassStringCharDemo();
            //   System.out.println( " value of s1:"+ pc.s1);
            System.out.println( " value of   string password s2:"+ pc.s2);//pune- readable form  hacker eailsy hack that. and in scp ,password stored remain and gc not applicable to remove it.
            System.out.println( " value of string password  s3:"+ pc.s3);//abc
           // System.out.println( " value of s4:"+pc.s4);
           // System.out.println( " value of   s5:"+ pc.s5);
            System.out.println( " value of  char  password ch:"+ pc.ch);// [C@1b6d3586  - thats why  char[] best to  store the pass-word
        }

    }


