package memory;

public class sep 
{

    
    int meth1(int a, int b)
    {
     System.out.println(a);
     System.out.println(a-b);
     return new sep().meth4(a-1,"hi");
    }   
    
    String meth2(int x)
    {
        System.out.println(x-new sep().meth1(200,199));
        System.out.println(x);

        return "java";
    }
    String meth3(int a, int b,String s)
    {
        System.out.println(a);
        System.out.println(a+a);
        System.out.println(a+b);
        return s;
        
    }
    int meth4( int a, String s)
        {
            System.out.println(a);
            System.out.println(s);
            
            return a;
        }
        String meth5( int a ,int b,String s)
        {
            return s ;
        }
    public static void main(String[] args) 
    {
        sep xobj = new sep();
     System.out.println((xobj.meth5(15,25,new sep().meth2(500))));


    }

    
}
