package memory.folder;

public class s1 {
  int x=10;
  static int y =20;
  int a;
  static int b ;
  boolean flag;
  
  void meth1()
  {
    System.out.println("meth1() called");
    int z=30;
    System.out.println("Instsnce variable"+ x);
    System.out.println("Instance variable:"+new s1().x);
    System.out.println("---------------------------");
    System.out.println("static variable :"+y);      // identifier through access
    System.out.println("static variable"+ s1.y);        // by using class name
    System.out.println("---------------------------------------------");
    System.out.println("local variable:"+z);
  }
  void meth2()
  {
    System.out.println("meth2() called ");
    System.out.println("x value:"+ x);
    System.out.println("y value: "+s1.y);  // we can access local variBLE outside


  }
  void meth3()
  {
    System.out.println("meth3 () called");
    int x =100;
    int y=200;
    System.out.println("Instance variable x: "+ new s1().x);
    System.out.println("static variable: "+s1.y);
    System.out.println("local variable: "+ x);
    System.out.println("local variable y: "+ y);
  }
  void meth4()
  {
    System.out.println("meth4 () called");
    int c;
    System.out.println("Instance variable: "+a);
    System.out.println("static variablr: "+b);
    System.out.println("Instance variable : "+flag);
  
  }

  public static void main(String[] args) 
  {
 s1 aobj=new s1();
 aobj.meth1();
 System.out.println("=========================================");
 aobj.meth2();
 System.out.println("==================================================");
 aobj.meth3();
 System.out.println("================================================");
 aobj.meth4();

  }  
    
}
