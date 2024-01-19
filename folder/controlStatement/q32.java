package memory.folder.controlStatement;

public class q32 {
    //Given the length & bredth of a rectangle, write a program to find whether the area of the rectangle is
    // greater then its perimeter.For example the area of the rectangle with length= 5,breadth=4 is greater than its 
    //perimeter
    public static void main(String[] args) 
    {
        int length= 5;
        int breadth = 4;
        int area= length*breadth;
        int rectangle= ( 2*(length+breadth));
        if(area>rectangle)
        {
              System.out.println(area+" is a area ");
        }
        else{
              System.out.println(rectangle+ " is a rectangle");
        }
         
        
    }
}
