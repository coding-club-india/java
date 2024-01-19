package memory;

public class thirteen_oct 
{
    public static void main(String[] args) 
    {
        int x= 20;
        int y= 30 ;
        if(y>x)
        {
               System.out.println("y is a greater than from x");
        }
        else if(x>y)
        {
          System.out.println("x is a greater than from y");
        }
        else
        {
          System.out.println("x variable is a equal to  y variable");
        }
        String z= y>x?"y is a greater than from x":x>y?"x is a greater than from y":"x variable is a equal to  y variable";;
        System.out.println(z);
        maximum_no();
    }


    static void maximum_no()
    {
        int x= 2,y=3,z=4;
        if(x<y)
        {
            if(y<z)
            {
                System.out.println("z is a greater than to all number ");
            }
              
            System.out.println("y is a greater than from x");
        }
        else if(x>y)
        {
            if(x<z)
            {
                System.out.println("z is a greater than two all number");
            }
            System.out.println("x is a greater than  y");
        }
        else if(y<z)
        {

            System.out.println("z ");
        }

        
     
    }
}
