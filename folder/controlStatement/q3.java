package controlStatement;

public class q3 
{
    // write a program to find a greater no. between agiven three no.
    public static void main(String[] args)
     {
        int num1=23,num2=32,num3=255;
        if(num1>num2 && num1>num3)
        {
          System.out.println(num1+" biggest number" );
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2 +"is biggest number" );

        }
        else
        {
            System.out.println(num3+" biggest number" );
        }
 String a = num1>num2 && num1>num3?num1+" biggest number":num2>num1 && num2>num3?num2 +"is biggest number":num3+" biggest number";
        System.out.println(a);
        
    }
}
