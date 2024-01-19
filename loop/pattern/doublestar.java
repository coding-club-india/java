public class doublestar
{
    public static void main(String[] args) 
    {
        int n=10;
        for(int r=1;r<=n;r++)
        {
           for(int c=r;c<=n-5;c++)           // c lessthan equal 10-5 it meanse 5
           {
            System.out.print("* ");
           }
           for(int j=0;j<=n-5;j++)
           {
            System.out.print("* ");
           }
           System.out.println();   
        }
        
    }
    
}
