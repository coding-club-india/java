public class q2 
{
    
    public static void main(String[] args)
     {
       
        int n=5;
        for(int r=1;r<=n;r++)
        {
            for(int a=1;a<=r;a++)
            {
                System.out.print("  ");

            }
         for(int b=1;b<=(n-r)+1;b++)
        {
            System.out.print("* ");
        }
        for(int b=1;b<(n-r)+1;b++)
        {
            System.out.print("* ");
        }

             System.out.println();
        }
        for(int r=2;r<=n;r++)
        {
            for(int a=1;a<=(n-r)+1;a++)
            {
                System.out.print("  ");

            }
            for(int b=1;b<=r;b++)
            {
                 System.out.print("* ");
            }
            for(int b=2;b<=r;b++)
            {
                 System.out.print("* ");
            }
            System.out.println();

        }

        butrfly aobj=new butrfly();
       aobj.butter();

        
        
    }
}


class butrfly
{

    void butter()
    {
        System.out.println("this is a butterfly");
        int n=5;
        for(int r=1;r<=n;r++)
        {
           for(int a=1;a<=r;a++)
           {
            System.out.print("* ");

           }
           for(int a=1;a<(n-r)+1;a++)
           {
            System.out.print("  ");

           }
           for(int a=1;a<(n-r)+1;a++)
           {
            System.out.print("  ");

           }
           for(int a=1;a<=r;a++)
           {
            System.out.print("* ");

           }
            System.out.println();

        }
        
        for(int r=1;r<=n;r++)
        {
            for(int a=2;a<=(n-r)+1;a++)
            {
              System.out.print("* ");
            }
            for(int b=1;b<=r;b++)
            {
              System.out.print("  ");
            }
            for(int c=1;c<=r;c++ )
               {
            
                 System.out.print("  ");
               }
               for(int c=2;c<=(n-r)+1;c++ )
               {
            
                 System.out.print("* ");
               }
             System.out.println();
        }
        
    }
}
