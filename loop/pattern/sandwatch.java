public class sandwatch 
{

    public static void main(String[] args) {
        
        
            int n= 7;
            for( int r=0,p=1 ;r<n;r++,p++)
            {
                for(int c=1;c<=r;c++){
                    System.out.print("  ");
                }
                for(int c=1;c<=n-r;c++){
                    System.out.print("* ");
                }
                for(int c=2;c<=n-r;c++){
                    System.out.print("* ");
                }
             System.out.println();
            }
            for(int r=2,p=1;r<=n;r++,p++)
            {
                for(int c=1;c<=n-r;c++)
                {
                 System.out.print("  ");
                }
                for(int c=1;c<=r;c++)
                {
                 System.out.print("* ");
                }
                for(int c=2;c<=r;c++)
                {
                 System.out.print("* ");
                }
               System.out.println();
            }
        }
    }


