package controlStatement;

public class q15 
{
    //write a program to input all sides of a triangle and check whether triangle is valid or not.  
    public static void main(String[] args) 
    {
       int side1 = 60 ,side2 = 60, side3 = 20;
       if ((side1 + side2)>side3 || (side2 + side3) >side1 || (side1+side3)>side2 )
       {
        System.out.println("Tringle is valid");
       } 
       else{
        System.out.println("Tringle is not valid");
       }
    }
}
