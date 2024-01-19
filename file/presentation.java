package file;

public class presentation {

    public static void main(String[] args) 
    {
     int f= 20;
     System.out.println(f);
   
       int  c=ram.b();
       System.out.println(c);
     ram b= new ram();
     int  d= b.a();
     System.out.println(d);

     ram.sid e=b.new sid();
     System.err.println(b.g);
    System.out.println(e.c); 
    System.out.println(e.g);
       
        
    }
    
}

class ram
{    
    static int g = 40;


    int a()
    {

        return 20;
    }
   static int b()
    {

return 50;
    }

    class sid
    {
         int c=50;
         static int g=58;

        int sidarth()
        {
            return 30;
        }

    }

}
