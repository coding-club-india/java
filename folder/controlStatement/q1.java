package controlStatement;
//  1. Write a program to find maximum between two no.?
public class q1 
{               
   int a=10;  //this is a linstance variable


   public static void main(String[] args)
    {

        int a = 23;                // this is a local variable
        int b = 34;
        if(a<b)
        {
            System.out.println("b is a larger no.");
        } 
        else{
            System.out.println("a is a larger no.");
        }
        String x =  a<b?   "b is a larger no.": "a is a larger no."; 
        System.out.println(x);            
    }
    
}
