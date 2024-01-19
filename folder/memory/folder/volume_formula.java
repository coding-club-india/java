package memory.folder;

public class volume_formula
 { 
    static int volume(int a, int b, int c)
    {

        int ans = a*b*c;
        return ans ;
    }


    public static void main(String[] args) 
    {
        int length = 10;
        int width = 30 ;
        int height = 60 ;
        int v = volume(length,width,height);
        System.out.println(" volume formula ="+ v); 
    }
    
}
