package file;

public class cube 
{
    public static void main(String[] args) {
        double b =10;
        double h = 5;
      cube x =new cube();
     double a= x.cube_volume(b);
     double triangle =  x.Area_of_triangle(b, h);
     System.out.println("Cube volume is:- "+a);
             System.out.println("Area of Triangle: "+triangle);
    }

    double cube_volume( double a)
    {
        double ans = a*a*a;
     return ans;
    }
    
    double Area_of_triangle(double b,double h){
        double ans=(b*h)/2;
        return ans;
    }
    
}
