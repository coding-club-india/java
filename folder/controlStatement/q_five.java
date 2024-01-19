package controlStatement;

public class q_five {
    // write a program to chek whether a number is even or odd.
    public static void main(String[] args) 
    {
        int num = 255;
        even(num  );
        
    }
    static int even(int num)
    {
        
        if(num % 2==0)
        {
           System.out.println(num+" is a even number");

        } 
        else
        {
            System.out.println(num+" is a odd number");
        }
       return 1;
    }
    
}
