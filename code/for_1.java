import java.util.Scanner;

public class for_1 
{
    
    public static void main(String[] args) {
        print pri= new print();
     //   pri.main();
        pri.System();
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number");
        // int x= sc.nextInt();
        // for(int i = 1;i<=x;i++)
        // {
        //   if(i%2==0)
        //   {
        //       System.out.println(i);
       // }
       // }
    }
}
class character
{
    public static void main(String[] args) 
    {
       
       
        for(char i=97;i<=122;i++ )
        {
            System.out.print(i);
            System.out.print(" ");

        }

        
    }

}
class print 
{
    void System()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        int a= sc.nextInt();
        int ans= 0;
        for(int i=a;i==0;i--)
        {   
          ans=i-5;
          System.out.print(ans);
            System.out.print("  ");
             
        }
         
         

    }
   void main()
   {
    for(char i=97;i<=122;i++)
    {
     if(i%2!=0)
     {
        System.out.print(i);
        System.out.print("    ");
     }
    }
   }
}
