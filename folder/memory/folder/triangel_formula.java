package memory.folder;

public class triangel_formula 
{
    static int triangle( int b, int h)
    {
        int ans = ((b*h)/2) ;
        return ans;
    }
    public static void main(String[] args) 
    {
        int  b = 20;
        int h = 30;
        int T = triangle(b,h);
        System.out.println(" triangle formula ="+ T); 
    }
    
}
