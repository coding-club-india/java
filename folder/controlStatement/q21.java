package controlStatement;

public class q21 
{
    //  write a program to input electricity unit charges and calculate toatal electricity bill
    //  according to the given condition :
    // for first 50 Units RS:0.50/unit
    // for next 150 Units RS:0.75/unit
    // for next 250 Units RS:1.20/unit
    // for unit above 250  RS:1.50/unit
    // An additional surcharge of 20% is added to the bill
    public static void main(String[] args)
    {
        int unit = 251;
        if(unit<=50)
        {
            System.out.println("total  amount Rs. "+unit*0.5+"/-");
        }
        else if(unit<=150)
        {
            System.out.println("total  amount Rs. "+unit*0.75+"/-");
        }
        else if(unit<=250)
        {
            System.out.println("total  amount Rs. "+unit*1.20+"/-");
        }
        else
        {
            float z =   (float) (unit*1.5) ;
            float x =  (z*20/100);
            float y = z+x;
            System.out.println("total  amount Rs. "+ y   +"/-");
        } }
    
}
