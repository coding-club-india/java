package file;

public class triangle 
{
     public static void main(String[] args) {
        int b= 4;
        int h= 5;
        triangle x=new triangle();
        double a=x.Area_of_triangle(b,h);
        System.out.println("Area of triangle:- "+a);
    }
    double Area_of_triangle(double b,double h)
    {
        double ans= (b*h)/2;
 return ans;
    }
    
}
