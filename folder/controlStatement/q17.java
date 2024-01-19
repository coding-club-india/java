package controlStatement;
public class q17 
{
    // write a program to find all roots of a quadratic equation 
    public static void main(String[] args) 
    {
        float a= 65,b= 56,c =6 ;
        float d = b*b-4*a*c;
        
        if (d==0)
        {
            float r1= (float)-b/2*(a) ,r2 = -b/2*a;
            System.out.println(r1 +" equation "+ r2);
          
        }
        else if(d>0)
        {
             float r1 = (-b + sqrt(d))/(2*a);
             float r2 = (-b - sqrt(d))/(2*a);
             System.out.println(r1+ " root "+ r2);

        }
        else{
            System.out.println("The roots are imaginary");
        }
    }

    private static float sqrt(float d) {
        return 0;
    }
    
}
