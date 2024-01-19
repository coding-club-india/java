package memory.folder;

public class September 
{  
   void meth1()
   {System.out.println(10);
    System.out.println(30);
    System.out.println("end");

   }
   int meth2(int a, int b, int c)
   {
    System.out.println(a);
    September xobj = new September();
    String s = xobj.meth5(100,"java is awesome");
    System.out.println(s);
    return a-c;
   }
   String meth3(String a,int b, int c)
   {
    System.out.println(b+c);
    return a;
   }
int meth4(int a, int b)
{
    System.out.println(b);
    September xobj = new September();
    int result = xobj.meth2(40,40,50);
    System.out.println(result);
    return b+10;
}
String meth5(int a,String s)
{
    System.out.println(a+a);
    September xobj = new September();
    String b = xobj.meth3("hi",10,40);
    System.out.println(b);
    return s;
}
    public static void main(String[] args) 
    {
        September xobj = new September();
        System.out.println("start");
        int result = xobj.meth4(20,10);
        System.out.println(result);
        xobj.meth1();
    }
    /********* 
    void meth1()
    {
   int a=10;
   System.out.println("meth1() called");
    }

    public static void main(String[] args) 
    {
        System.out.println("Start");
        new September().meth1();
        System.out.println("end");
    }
****************************/
    /*** *****************
    void meth1(int a,int b)
    {
        System.err.println("meth1()called");
        System.out.println("a value : "+ a);
        System.out.println("b value : "+ b);
        System.out.println(10+b);
    }

public static void main(String[] args)
 {
   September aobj = new September();
   aobj.meth1(99,1); 
}
*******************************/
  /*   void main()
    {
System.out.println(10);
new September().meth2();
System.out.println(20);
    }
    void meth1()
    {
        new September().main();
    }
void meth2()
{
System.out.println(30);
System.out.println(40);
}
void meth3()
{
    System.err.println(50);
    new September().meth1();
    System.out.println(60);
}
    public static void main(String[] args) 
    {
        System.out.println("start");
        new September().meth3();
        System.out.println("end");
        
    }
    ***/



   
}
