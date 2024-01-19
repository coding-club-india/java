public class hollw_number {
    
    public static void main(String[] args) {
        
        int n=5;
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=r;c++)
            {
                if(c==r||c==1||r==n){
                  System.out.print(r+" ");
            }
            else{
                System.out.print("  ");
            }
        }
              System.out.println();
        }
        System.out.println("--------");
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=r;c++)
            {
                if(c==r||c==1||r==n){
                  System.out.print(r+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        for(int c=2;c<=n-r+1;c++){
              System.out.print("  ");
        }
        for(int c=2;c<=n-r+1;c++){
              System.out.print("  ");
        }
        for(int c=1;c<=r;c++)
            {
                if(c==r||c==1||r==n){
                  System.out.print(r+" ");
            }
            else{
                System.out.print("  ");
            }
        }
              System.out.println();
        }
        System.out.println("--------");
        for(int r=1;r<=n;r++)
        {
            
        for(int c=2;c<=n-r+1;c++){
              System.out.print("  ");
        }
        for(int c=1;c<=r;c++)
            {
                if(c==r||c==1||r==n){
                  System.out.print(r+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        for(int c=2;c<=r;c++)
            {
                if(c==r||c==1||r==n){
                  System.out.print(r+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        for(int c=2;c<=n-r+1;c++){
              System.out.print("  ");
        }
        
              System.out.println();
        }
        System.out.println("--------------------------");
        for(int r=1;r<=n;r++)
        {
          
        }

    }
}
