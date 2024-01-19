package controlStatement;

public class q2 
{
    // write a program to check a greater no. 
    public static void main(String[] args) {
        
    int num1 = 23, num2 = 23;
    if(num1<num2)
    {
        System.out.println(num1 +"is a less than " +num2);
    }
    else if(num1>num2)
    {
        System.out.println(num1 +"is a greater than " +num2);
    }
    else
    {
        System.out.println(num1 +" is a equal to " + num2);
    }
String x = (num1<num2)?num1 +"is a less than " +num2:(num1>num2)?(num1 +"is a greater than " +num2):(num1 +" is a equal to " + num2);
    System.out.println(x);
}
    
}
