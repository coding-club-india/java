package memory.folder;

public class Compound_interest 
{   
    static int interest(int a, int b, int c,int d)
    {
        int ans = a(1+b/d)^c ;

        return ans;

    }
    private static int a(int i) {
        return 0;
    }
    public static void main(String[] args) 
    {
    int p = 1000 ;
    int r = 3 ;
    int t = 3 ;
    int n = 3 ;
    int ci = interest(p,r,t,n);
    
    System.out.println("compound interst ="+ ci);
    }
}
