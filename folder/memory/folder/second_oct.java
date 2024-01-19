package memory.folder;

public class second_oct 
{
    
  static void main()
  {
System.out.println("-----------meth1()------------");
 System.out.println(10);
  }
  
  int meth2(int a,int b)
  {
  
  System.out.println("-----------meth2()--------------------");
  System.out.println(a+b);
    return a;
  }
  int meth3()
  {
System.out.println("--------------meth3()----------------------");

    return 'A';
  }
  int meth4(int a)
  {
System.out.println("-------------meth4()----------------------");
System.out.println(" a value print:- "+a);
    return 'A'+5;

  }
char meth5()
{
    System.out.println("--------------------meth5()-------------------");
    return 65;
}
int meth6(int a)
{
    System.out.println("---------------------meth6()----------------------");
    if (a<=10)
    {
    System.out.println("if block excute");
    return a+10;
    }
    else{
        System.out.println("else block excute");
    return a+20;
}
}


    public static void main(String[] kishan)
    { 
         System.out.println("--------------------Start-----------------");
        main();
        System.out.println("-------------------------------------------");
       
        second_oct aobj = new second_oct();
        aobj.meth2(99,1);
        System.out.println("-----------------------------------------------------------");
        System.out.println("meth3() is returning===>"+aobj.meth3());
        System.out.println("---------------------------------");
        System.out.println("meth4() is returning===>"+aobj.meth4('a'));
        System.out.println("---------------------------------");
        System.out.println("meth5() is returning===>"+aobj.meth5());
        System.out.println("---------------------------------");
        System.out.println("meth6() is returning===>"+aobj.meth6(5));
        System.out.println("-------------------end-----------------------------");
        System.out.println("---------------------------------");


           
    }
}
