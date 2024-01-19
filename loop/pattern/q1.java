public class q1 
{      // piramid
    //       *
    //     * * *
    //   * * * * *
    // * * * * * * *
   //* * * * * * * * *
    public static void main(String[] args) 
    {
      riverse_piramid aobj=new riverse_piramid();
      aobj.main();
      aobj.pi();
      
      System.out.println();
      System.out.println();
      System.out.println("this is a hill");
        
       for(int r=0;r<=5;r++)
       {
         for(int c=0;c<=(5-r)+1;c++)
          {
              System.out.print("  ");
          }
          for(int a=0;a<=r;a++)
          {
              System.out.print("* ");
          }
          for(int a=0;a<r;a++)
          {
              System.out.print("* ");
          }
          
           System.out.println();
       }
       System.out.println("---------------------------------------------------------");
       System.out.println("this is a piramid");
       
       
       
       
       int n= 5;
       for(int r=1;r<=n;r++)
       {
        for(int a=1;a<=(n-r)+1;a++ ){
          System.out.print(" ");

        }
        for(int b=1;b<=r;b++)
        {
          System.out.print("* ");

        }
           System.out.println();
       }

       
        
    }
  }

  
  

  class riverse_piramid
  {
   void main()
   {System.out.println("this is a reverse piramid");
    int n=5;
    for(int r = 1;r<=n;r++)
    {
      for(int a=1;a<=r;a++)
      {
           System.out.print(" ");
      }
      for(int b=1;b<=(n-r)+1;b++)
      {
       System.out.print("* ");
      }
        System.out.println();
    }
    
   }



   void pi()
   {System.out.println("this is a reverse hill");
    int n=5;
    for(int r = 1;r<=n;r++)
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
    }
    }
   //
   //
   //
   //


  
    

