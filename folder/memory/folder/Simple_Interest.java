package memory.folder;

public class Simple_Interest
 {
    static int interest(int a,int b,int c)
    {

       int ans = (a*b*c)/100 ;

      return ans;
    }

    public static void main(String[] args) 
    {
       int p = 1000;
       int r = 3 ;
       int t = 3 ;
       int si = interest(p,r,t);
       System.out.println("simple interest ="+ si);
    }
}
