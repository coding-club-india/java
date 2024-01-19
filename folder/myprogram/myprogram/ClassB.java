package myprogram;

public class ClassB 
{
    int a= 10;               // INstance variable or non-static variable
    static int b=20;
  
    void meth1()  // non static method
  
    {
        System.out.println("Instance = variable: "+a);
        System.out.println("static = variable: "+b);
    }
   static void meth2()   //static method or function
    {
       System.out.println("Instance  variable: "+new ClassB().a);
       System.out.println("static variable: "+b);
    }
    public static void main(String[] args) {
        ClassB aobj = new ClassB();
        aobj.meth1();
        System.out.println("-----------------------------------------------------------------");
        meth2();
        ClassB.meth2();
        meth2();

    }

    
}
