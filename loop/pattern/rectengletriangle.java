import java.util.Scanner;

public class rectengletriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer no.");
        int a= sc.nextInt();
        for(int r=0;r<=a;r++)
        {
        for(int c=0;c<=r;c++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
        
    }
    
}
