package loop;

import java.util.Scanner;

public class q1 
{
    public static void main(String[] args) 
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number");
       int a=sc.nextInt();
        for(int i=a;i>=0;i--)
        {
            System.out.print(i);
            System.out.println("  ");
            i=i-4;
        }
    }
}
