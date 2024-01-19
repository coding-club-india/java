package memory.folder;

public class triangle 
{
    static int triangle1( byte b, byte h)
    {
        int ans = (b*h)/2;
        return ans;
    }
    public static void main(String[] args) 
    {
        byte  b = 20;
        byte h = 30;
        byte  T = (byte) triangle1(b,h);
        System.out.println(" triangle formula ="+ T);
    } 
    
}
