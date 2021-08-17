
package com.ict.stringdata;
 //16 char capaity by default// constructor in string buffer
public class StringBufferDemo {
    public static void main(String[] args) {
//
//        //constructors
//        StringBuffer sb= new StringBuffer();
//        System.out.println(" default capacity:"+ sb. capacity());
//        StringBuffer sb1 =new StringBuffer("india");
//        System.out.println("  india capacity with literals/string:"+ sb1. capacity()); //16+5(literl value)=21
//        StringBuffer sb2= new StringBuffer( 20);
//        System.out.println("   user defined capacity:"+ sb2. capacity());
//        CharSequence  charSeq=  new StringBuffer("abcedfg");
//        StringBuffer sb3= new StringBuffer(charSeq);
//        System.out.println("    CharSequence   capacity:"+ sb3. capacity());
//
//        // methods
//        // why sb showing two differnt capacity for same value // refer: sb5 and sb6
//        StringBuffer sb5= new StringBuffer("java"); // 16+4 =20
//        System.out.println(sb5);
//        System.out.println("before appendcapacity:"+ sb5. capacity());//20
//        sb5.append(" programming");
//        System.out.println(sb5);
//        System.out.println("after appendcapacity:"+ sb5. capacity());//20
//
//        StringBuffer sb6= new StringBuffer("java programming");
//        System.out.println(sb6);
//        System.out.println("capacity:"+ sb6. capacity());//32
//        //-----------------------------------------------------------------//
//        StringBuffer sb7= new StringBuffer("abc"); //16+3=19
//        StringBuffer sb8= new StringBuffer();
//        sb8.append(sb7);// just update thevalue not change  capacity(remain same)
//        System.out.println("value of :"+sb8); //16
//        System.out.println("capacity sb7:"+ sb7. capacity() +"  sb8-->"+sb8.capacity());//32
//        //-------------------------charAt(int index);----------------------------//
//        StringBuffer sb9= new StringBuffer("abcdefghijklmnopq");
//        System.out.println("value:"+ sb9+"  capacity:"+ sb9. capacity());
//        char ch= sb9.charAt(3);
//        System.out.println("value:"+ ch);
//       //-------------------------deleteCharAt(int index)----------------------------//
//        StringBuffer sb10=  sb9.deleteCharAt(3);
//        System.out.println("value:"+ sb10+"  capacity:"+ sb10. capacity());
//        //-------------------------deleteChar(int start,int end)----------------------------//
//        StringBuffer sb11=  sb9.delete(3 ,7);
//        System.out.println("value:"+ sb11);
//        //-------------------------indexOf("string str") andlastIndexOf("string str")----------------------------//
//        StringBuffer sb12= new StringBuffer("abcdec");
//        System.out.println("index of c:"+ sb12.indexOf("c"));//2
//        System.out.println(" lastIndex of c:"+ sb12.lastIndexOf("c"));
//        System.out.println("index of c:"+ sb12.indexOf("a"));//0
//        System.out.println("index of c:"+ sb12.indexOf("bce"));//-1-not find the string value is -1
//        System.out.println("index of c:"+ sb12.indexOf("bcd"));//1
//        //-------------------------reverse()----------------------------//
//        StringBuffer sb13=new StringBuffer("sachin");
//        System.out.println("reverse StringBuffer value:" +sb13.reverse());
//        String name= new String(sb13.reverse());
//        System.out.println( "string reverse method:"+ name);
//
//        //-------------------------insert(offset,str)---------------------------//
//        StringBuffer sb14= new StringBuffer("Virat");
//        System.out.println("insert string in middle "+sb14.insert(3,"s"));
//        StringBuffer sb15= new StringBuffer("Virat");
//        System.out.println("insert char in middle "+sb15.insert(3,'s'));
//        System.out.println("insert string in middle "+sb15.insert(3,"vvv"));
//
//        //-------------------------replace (start,end, string)---------------------------//
//        StringBuffer sb16= new StringBuffer("ABCDEGH");
//        System.out.println(" replace:"+ sb16.replace(2,5,"pqr")); // :ABpqrGH:-ending index always  endinginde-1
//
//        //-------------------------setCharAt(index,chr);---------------------------//
//        StringBuffer sb17= new StringBuffer("ABCDEGH");
//        sb17. setCharAt(2,'v');
//        System.out.println(" setCharAt operation:"+sb17);//ABvDEGH- replace the c to v
//        //-------------------------trimToSize()---------------------------//
//        StringBuffer sb18= new StringBuffer("ABC");
//        System.out.println("before trim to size capacity:"+ sb18. capacity());
//        sb18.trimToSize();
//        System.out.println(" after trim to size capacity:"+ sb18. capacity());
//
//        StringBuffer sb19= new StringBuffer();
//        sb19.append("pqr");
//        System.out.println(" default  sb19 capacity"+ sb19.capacity());
//        sb19.ensureCapacity(120);
//        sb19.append("pqr");
//        System.out.println(" ensureCapacity   sb19 capacity:"+ sb19.capacity());
//
//        StringBuffer sb20= new StringBuffer();
//        sb20.append("pqr");
//        System.out.println(" default  sb20 capacity"+ sb20.capacity());
//        sb20.ensureCapacity(120);
//        System.out.println(" ensureCapacity  sb20 capacity:"+ sb20.capacity());
//        sb20.append("pqr");
//        System.out.println(" ensureCapacity  sb20 capacity:"+ sb20.capacity());
//
//
//        StringBuffer sb21= new StringBuffer();// 16
//        System.out.println(" default  sb21 capacity"+ sb21.capacity());//16
//        sb21.ensureCapacity(3);
//        sb21.append("pqrabaqw");
//        System.out.println(" ensureCapacity  sb20 capacity:"+ sb21.capacity());//16
//
//  //===============================   string max default size then use some formula
//        // ==================
//        //(defaultsize+2)+2
//        StringBuffer sb22= new StringBuffer("abcd");//16+4
//        System.out.println(" default  sb22 capacity"+ sb22.capacity());
//        sb22.append("ABCDEFGHIJKLMNopk");//17
//        System.out.println(" default  sb22capacity"+ sb22.capacity());//42//(defaultsize+2)+2 use this formula
//        StringBuffer sb23= new StringBuffer("abcd");
//        sb23.append("ABCDEFGHIJKLMNopk");//17-
//        System.out.println(" default  sb23 capacity"+ sb23.capacity());//42//(defaultsize+2)+2 use this formula
//
//        StringBuffer sb24= new StringBuffer(4);
//        sb24.append("abcdef");
//        System.out.println(" default  sb24 capacity"+ sb24.capacity());


        StringBuffer sb25= new StringBuffer(3);
        sb25.ensureCapacity(4);
      sb25.append("abcfgghhjjjjjjjja");
        System.out.println(" default  sb25 capacity"+ sb25.capacity());
    }
}
