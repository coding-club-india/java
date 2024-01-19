public class number_pattern 
{
    
    public static void main(String[] args) {
        int n=5;
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=r;c++){
                System.out.print(r+" ");
            }
            System.out.println();
        }

        System.out.println(" --------------decreesing number-------------");
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n-r+1;c++){
                System.out.print(c+" ");

            }
    System.out.println();
        }
    
    System.out.println(" --------------decreesing number-------------");
        for(int r=n;r>0;r--){
            for(int c=n;c>n-r;c--){
                System.out.print(r+" ");

            }
    System.out.println();
        }

   System.out.println(" --------------decreesing number-------------");
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n-r+1;c++){
                System.out.print("  ");

            }
            for(int a=1;a<=r;a++)
            {
                System.out.print(a+" ");
            }
            for(int a=1;a<=r-1;a++)
            {
                System.out.print(r-a+" ");
            }
             System.out.println();
        }
        for(int r=2;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print("  ");

            }
            for(int a=1;a<=n-r+1;a++)
            {
                System.out.print(a+" ");
            }
            for(int b=n-1;b-r+1>=1;b--){
               System.out.print(b+" ");
               
            }
            System.out.println();
        }
        
        System.out.println("-------------------timer watch-------");
        for(int r=1;r<=n;r++)
        {
            for(int a=1;a<=r;a++){
             System.out.print("  ");
            }
            for(int b=1;b<=n-r+1;b++){
             System.out.print(r+" ");
            }
            for(int c=2;c<=n-r+1;c++){
                System.out.print(r+" ");
            }
        System.out.println();
        }
        for(int r=2;r<=n;r++)
        {
            for(int c=1;c<=n-r+1;c++)
            {
             System.out.print("  ");
            }
            for(int a=1;a<=r;a++)
            {
                System.out.print(n-r+1+" ");

            }
             for(int a=2;a<=r;a++)
            {
                System.out.print(n-r+1+" ");

            }
            System.out.println();
          
        }
    }
}

