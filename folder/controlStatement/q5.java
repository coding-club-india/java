package controlStatement;

public class q5 
{               
       // write a program to check whether a number is divisible by 5 and 11or not?
   public static void main(String[] args) {
    
    int num=63;
    
    if(num%5==0)
    {
        System.out.println("number is divisible by 5" );
    }
    else if(num%11==0)
    {
        System.out.println("number is divisible by 11" );
    }
    else
    {
       System.out.println(num +" is not divisible by 5 and 11" ); 
    }
 String x=(num%5==0)?"number is divisible by 5":(num%11==0)?("number is divisible by 11" ):(num +" is not divisible by 5 and 11" );
 System.out.println(x);
   } 
}
