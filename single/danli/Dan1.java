package danli;

import java.io.Serializable;

class Dan1 implements Serializable {
   private  static Dan1 dan1=new Dan1();
   private Dan1(){
       if(dan1!=null){
           throw new RuntimeException();
       }
   }
    static Dan1 getInstance(){
       return dan1;
   }

   private Object readResolve()  {
       return dan1;
   }
}
