package com.ict.stringdata;

public class reverseString {
    public static void main(String[] args) {

    String input =" virat kohali";
    char[] ch=input.toCharArray();
    int start=ch.length;
        System.out.println(start);
        for(int k=start-1;k>=0;k--){
            System.out.print(ch[k]);
        }

}

}