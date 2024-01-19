public class hollow_square 
{
    public static void main(String[] args) 
    {
        int n= 7;
        for(int r= 1;r<=n;r++)
        {
           
            
            for(int a=1;a<=n;a++){
                 if (r==1||a==1||a==7||r==7) {
                System.out.print("* ");
                }
            
            else{
                System.out.print("  ");
            }
        }
            System.out.println();
            

        }
        System.out.println();
         System.out.println();
          System.out.println("hollow triangle");
         hollow_triangle aobj=new hollow_triangle();
         aobj.main();
        
    }
    
}

class hollow_triangle
{

    void main()
    {
        int n=7;
        for(int r=1;r<=n;r++)
        {
          for(int c=1;c<=r;c++)
          {
            if(c==1||r==1||r==n||c==r){
               System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }

          }
          System.out.println();
        }

        System.out.println("right triangle  ");
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n-r+1;c++)
            {
                System.out.print("  ");
            }
          for(int c=1;c<=r;c++)
          {
            if(c==1||r==1||r==n||c==r){
               System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }

          }
          System.out.println();
        }



        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(" -----------hollow hill-------------- ");
       for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n-r+1;c++)
            {
                System.out.print("  ");
            }
          for(int c=1;c<=r;c++)
          {
            if(c==1||r==1||r==n){
               System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }

          }
          for(int c=2;c<=r;c++)
          {
            if(r==n||c==r )
            {
System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
              
          }
          System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println(" ---------hollow plus-----------");

        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n;c++)
            {
    if(n%2==0){

            if(c==n/2||r==n/2)
            {
              System.out.print("* ");
            }
            else{
                 System.out.print("  ");
            }
          }
         //  ----hollow no. odd par this program work
    else{
        if(c==n/2+1||r==n/2+1)
            {
              System.out.print("* ");
            }
            else{
                 System.out.print("  ");
            }
    }
        }
            System.out.println();
        }





             System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("----------mulplication sign in hollow---------- ");

            for(int r=1;r<=n;r++)
            {
              for(int c=1;c<=n;c++)
              {
              
                if(c==r||r==1&&c==n||r==2&&c==n-1||r==3&&c==n-2||r==4&&c==n-3||r==5&&c==n-4||r==6&&c==n-5||r==7&&c==n-6||r==8&&c==n-7)
                {
                System.out.print("* ");
                }
                else{
                  System.out.print("  ");
                }
              }
              System.out.println();
            
            }

            System.out.println();
             System.out.println();
              System.out.println();
               System.out.println("-------hollow butterfly---------- ");
               for(int r=1;r<=n;r++)
            {
              for(int c=1;c<=n;c++)
              {
              
                if(c==r||r==1&&c==n||r==2&&c==n-1||r==3&&c==n-2||r==4&&c==n-3||r==5&&c==n-4||r==6&&c==n-5||r==7&&c==n-6||r==8&&c==n-7||r==1||r==7)
                {
                System.out.print("* ");
                }
                else{
                  System.out.print("  ");
                }
              }
              System.out.println();
            
            }

            System.out.println();
             System.out.println();
              System.out.println();
               System.out.println("-------hollow butterfly original---------- ");
               for(int r=1;r<=n;r++)
            {
              for(int c=1;c<=n;c++)
              {
              
                if(c==r||r==1&&c==n||r==2&&c==n-1||r==3&&c==n-2||r==4&&c==n-3||r==5&&c==n-4||r==6&&c==n-5||r==7&&c==n-6||r==8&&c==n-7||c==1||c==7)
                {
                System.out.print(" * ");
                }
                else{
                  System.out.print("   ");
                }
              }
              System.out.println();
            
            }

             System.out.println();
             System.out.println();
              System.out.println();
               System.out.println("-------hollow timer watch---------- ");
               for(int r=1;r<=n;r++)
            {
              for(int c=1;c<=n;c++)
              {
              
                if(c==r||r==1&&c==n||r==2&&c==n-1||r==3&&c==n-2||r==4&&c==n-3||r==5&&c==n-4||r==6&&c==n-5||r==7&&c==n-6||r==8&&c==n-7||c==1||c==7||r==1||r==7)
                {
                System.out.print(" * ");
                }
                else{
                  System.out.print("   ");
                }
              }
              System.out.println();
            
            }

    }
}
