package memory.folder.myprogram;

public class ClassA
 {
    int a;
    static int b;
    ClassA()
    {
        a++;
        b++;
        System.out.println("Instance variable: "+a);
        System.out.println("Static variable: "+b);
    }
    public static void main(String[] args)
    {
     new ClassA();
     System.out.println("------------------------------------------------------------");
     new ClassA();
     System.out.println("------------------------------------------------------------");
     new ClassA();
    }
    public void meth1() 
    {
    }
    public void meth2()
     {
    }
    
}
