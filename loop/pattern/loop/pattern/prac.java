package loop.pattern;
public class prac 
{
    public static void main(String[] args)
     {
        int n=3;
        for(int r=1;r<=n;r++)
        {
         for(int a=1;a<r;a++)
         {
           System.out.print("* ");
         }
         for(int b=1;b<=n-r+1;b++)
         {
           System.out.print("  ");
         }
         for(int b=1;b<=n-r;b++)
         {
           System.out.print("  ");
         }
         for(int a=1;a<r;a++)
         {
           System.out.print("* ");
         }
         

         System.out.println();
        }


        for(int a=1;a<=n+(n-1);a++)
        {
            System.out.print("* ");
        }
        System.out.println();
        


        for(int r=1;r<=n;r++)
        {
            for(int a=1;a<=n-r;a++)
            {
              System.out.print("* ");
            }
            for(int b=1;b<=r;b++)
            {
                System.out.print("  ");
            }
            for(int c=1;c<=r-1;c++){
                System.out.print("  ");
            }
            for(int d=1;d<=n-r;d++)
            {
                System.out.print("* ");
            }
           System.out.println();
        }
    }
}
//*           *
//* *       * *
//* * *   * * *
//* * * * * * *