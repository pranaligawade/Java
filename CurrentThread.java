class currentThread
   {
      public static void main(String args[])
       {
         Thread t=Thread.currentThread();
         System.out.println("current thread is:"+t);
         t.setName("myThread");
         System.out.println("After changing name is:"+t);
       }
   }