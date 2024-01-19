import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        int n=5;
        for(int r=1;r<=n;r++)
        {
               for(int c=1;c<=n;c++)
               {
                if(r==1||r==n||c==1||c==n){
                System.out.print("* ");
               }
               else{
                System.out.print("  ");
               }
               }
                
               
       
            System.out.println();

        }
        for(int r=1;r<=n;r++)
        {
          for(int c=1;c<=n;c++)
                {
                 if(r==n||c==n){
                 System.out.print("* ");
               }
               else{
                 System.out.print("  ");
               }
              }
              System.out.println();
        }
        System.out.println("--------------------------------------------------------");
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n;c++)
            {
              if(r==2&&c==2||c==n/2+1||r==n)
              {
                System.out.print("* ");
              }
              else{
                System.out.print("  ");
              }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n;c++)
            {
              if(r==1||c==n){
                 System.out.print("* ");
              }
              else{
                System.out.print("  ");
              }
            }
            System.out.println();
        }
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n;c++)
            {
              if(r==n||r==1){
                 System.out.print("* ");
              }
              else{
                System.out.print("  ");
              }
            }
            System.out.println();
        }
          number aobj=new number();
          aobj.main();  
            
    }
}
class number
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number ");
        int n=sc.nextInt();
        for(int r=1;r<=n;r++)
        {
           for(int c=1;c<=n;c++)
           {
            if(r==1||r==n||c==1)
            {
             System.out.print("* ");
            }
           }
           System.out.println();
        }
    }
}
