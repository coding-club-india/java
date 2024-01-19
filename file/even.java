import java.util.Scanner;
public class even 
{
    static void fact()
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1;
        for(int i=1;i<=a;i++)
        {
          b=b*i;
          System.out.println("no."+b);
        }

    }
    public static void main(String[] args) {
     
        
        
            int n = 5; // number of rows for the half of the diamond
            // Print the upper half of the diamond
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j < (i * 2); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Print the lower half of the diamond
            for (int i = n; i > 1; i--) {
                for (int j = n; j > i - 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j < (i - 1) * 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        
    
    // for(int i=1;i<21;i++){
        
       
    // if(i%3==0 && i%5 ==0)
    //    {
    //     System.out.println("fizz buzz");
    //    }
    //    else if(i%3==0)
    //    {
    //      System.out.println("fizz");  
    //    }
    //    else if(i%5==0)
    //    {
    //      System.out.println(" buzz");
    //    }
    //    else{
    //     System.out.println(i);
    //    }
       
    // }
    }
}


// *               *
// * *           * *
// * * *       * * *
// * * * *   * * * *
// * * * * * * * * *
// * * * *   * * * *
// * * *       * * *
// * *           * *
// *               *
