package controlStatement;

public class q14 
{
   // write a program to input  angles of a triangle and check whether triangle is valid or not 
    public static void main(String[] args) 
    {
        int angle1= 80, angle2 = 60, angle3 = 60;
        int sum = angle1+angle2+angle3;
        if(sum == 180 && angle1>0 && angle2>0 && angle3>0)
        {
              System.out.println(sum +" is a valid triangle");
        }
        else{
               System.out.println(sum +" is not valid triangle");
        }
    }
    
}
