package memory.folder.controlStatement;

public class q4 
{      
    //write a program to check whether a number is negative positive or zero.
    public static void main(String[] args) 
    {
        int num = 0, num1= -6;

        if(num<num1)
        {
           System.out.println(num1 +" is a positive number"); 
        }
        else if(num>num1)
        {
           System.out.println(num1 +" is a negative  number"); 
        
        }
        else
        {
            System.out.println(num1 + " is a zero number");
        }
String x= (num<num1)?(num1 +" is a positive number"):(num>num1)?(num1 +" is a negative  number"):(num1 + " is a zero number");
    System.out.println(x);
}
    
}
