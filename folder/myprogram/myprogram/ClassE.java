package myprogram;

public class ClassE {
    static int a= meth1();  // 100
    static int meth1()
    {
        ClassE.a=50;   
        System.out.println("meth1() called");  //1st
        return meth2();
    }
    public static void main(String[] args) {
        System.out.println(ClassE.a);    //120

    }
    static
    {
        System.out.println("static block execute: "+a);  //100 3rd
        ClassE.a = a+20;          //120
    }
    static int meth2()
    {System.out.println(ClassE.a);   //2nd
  return 100;
    }

}
