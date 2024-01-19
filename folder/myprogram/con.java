package memory.folder.myprogram;

public class con 
{
   /*con()
    {
        System.out.println("non parameterized contructor");
    }
    con(int a,int b)
    {
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
       System.out.println("parameterized constructor called: "+(a+b));
       new con().meth2();
    }  */
    void meth1()
    {
        System.out.println("meth1 called");
    }
    void meth2()
    {
        System.out.println("meth2 ( ) called");
    }
   
    public static void main(String[] args)
    {
      new con().meth1();
    }
}
