 package controlStatement;

import java.util.Scanner;

public class for_loop 
{

    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int x= sc.nextInt();
       // System.out.println("The enterd number is : "+x+" and the Even number b/w 1 and "+x+" are:- ");
        for(int i=1; i<=x;i++)
        {
            if(i%2==0)
            {
              System.out.println(i);
            }

        }   
    }

    @Override
    public String toString() {
        return "for_loop []";
    } 
}