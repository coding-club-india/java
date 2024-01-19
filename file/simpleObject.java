

public class simpleObject 
{
     int a;
     simpleObject(int b)
     {
      a=b;

     }
    public static void main(String[] args)
    {
        simpleObject aobj=new simpleObject(20);
        System.out.println(aobj.a);
        simpleObject bobj= new simpleObject(30);
        System.out.println(bobj.a);
        


    }
    
}