package memory;

public class surface_area_practice1
 {
static long cube_surface_area(int a)
{
   long ans = 6*a*a;
    return ans ;
}
long cuboid_surface_area(long l,long b, long h)
{
   long ans = 2*(l*b+b*h+h*l) ;
    return ans;
}
double cylinder_surface_area(int r,int h )
{
    double ans = 2*22/7*r*(h+r) ;
return ans;
}

    public static void main(String[] args)
     {
        int l = (byte)4;
        int b = 4;
        int h = 3;
        int r = 4 ;
        System.out.println(" Cube surface area = "+ cube_surface_area(l)  +" squarefit");
        surface_area_practice1 xobj =new surface_area_practice1();
        long  a = xobj.cuboid_surface_area(l,b,h);
        System.out.println("Cuboid surfacce area = "+ a  +" squarefit");
        double c  = 3 ;
        System.out.println(" Cylinder surface area = "+xobj.cylinder_surface_area(r,h) +" squarefit");
   System.out.println(c);
    }
    
}
