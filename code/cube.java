public class cube 
{
    public static void main(String[] args) {
        int b =10;
        int h = 5;
      cube x =new cube();
     int a= x.cube_volume(b);
     int triangle = (int) x.Area_of_triangle(b, h);
     System.out.println("Cube volume is:- "+a);
             System.out.println("Area of Triangle: "+triangle);
    }

    int cube_volume( int a)
    {
        int ans = a*a*a;
     return ans;
    }
    
    double Area_of_triangle(int b,int h){
        double ans=1/2*(b+h);
        return ans;
    }
    
}
