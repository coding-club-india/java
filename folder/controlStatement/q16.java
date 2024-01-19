package controlStatement;

public class q16 
{
    // write a program to check whether the triangle is equilateral ,isosceies or scalience triangle
    public static void main(String[] args) 
    {
        int side1=4, side2= 4, side3 = 5;
        if (side1== side2 && side2 == side3 )
        {
              System.err.println(side1+" "+side2+" "+side3+" is equilateral triangle");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1 )
        {
          System.err.println(side1+" "+side2+" "+side3+" is isoceies triangle");
        }
        else
        {
              System.err.println(side1+" "+side2+" "+side3+" is scalience triangle");
        }
    }
    
}
