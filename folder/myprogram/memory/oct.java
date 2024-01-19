package memory.folder.myprogram;

public class oct 
{
    int i;
    int b;
    short s;
    long l;
    float f;
    double d;
    char c;
    boolean flag;
    void meth1()
    {
        
        System.out.println("Print the default values of the 8 primitive datatypes");
        System.out.println("int value: "+i);
        System.out.println("byte VALUE:  "+b);
        System.out.println("short value: "+s);
        System.out.println("long value: "+l);
        System.out.println("float variable: "+f);
        System.out.println("double value: "+d);
        System.out.println("char value : "+ c);
        System.out.println("boolean value : "+flag);
    }
    void meth2()
    {
        int i1=10;
        int i2=20;
        int i3= i1+i2;
        System.out.println("i3 value: "+i3);
        byte b1=10;
        byte b2=20;
        byte b3 = (byte) ((byte)b1+b2);
        System.out.println("b3 value : "+b3);
        float f= 10.9f;
        long x = 678987656787656l;
        System.out.println("float value : "+f);
        System.out.println("long value: "+x);
    }
    public static void main(String[] args) 
    {
   oct aobj= new oct();
   aobj.meth1();
   System.out.println("-----------------------------------------------");
   aobj.meth2();    
    }
    
}
