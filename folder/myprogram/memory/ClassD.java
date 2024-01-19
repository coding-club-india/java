package memory.folder.myprogram;

public class ClassD 
{
    static int a;
    final static int b;
    void meth1()
    {
        a=10;
        //b= 50;// c.e.
        System.out.println("meth1() called");
    }
    static void meth2()
    {
        //b= 50;//c.e.
        System.out.println("static method() called");
    }
    static
    {
        b=50;
        System.out.println("1st static block executed");
    }
    public static void main(String[] args) 
    {
        System.out.println("main() called");
        ClassD aobj= new ClassD();
        aobj.meth1();
        System.out.println("a value: "+ a);
        System.out.println("b value : "+b);
        
    }
    static
    {
        //b=100; //c.e.
        System.out.println("2nd block executed");
        meth2();
    }
}
