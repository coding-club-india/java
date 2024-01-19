public class swatic {
    

    public static void main(String[] args) {
        int a= 5;

        for(int r=1;r<=a;r++)
        {
         for(int c= 1;c<=a;c++)
         {
            if(r==1&&c==1 || c==3&& r==1 || c==4&& r==1 || c==5&& r==1 || c==1&&r==1 ||c==1&&r==2|| r==3&& c==1||r==3&& c==2||r==3&& c==3||r==3&& c==4||r==3&& c==5 ||r==1&& c==3 ||r==2&& c==3 ||r==3&& c==3 ||r==4&& c==3 ||r==5&& c==3|| c==5&&r==4 || r==5&&c==5 || c==1&& r==5 || c==2 && r==5)
            {
              System.out.print("* ");
            }
            else{
              System.out.print("  ");
            }
         }

          System.out.println();
        }
         System.out.println("------------------------------------------");
   
             swastic2 obj =new swastic2();
             obj.dis();
             }
}
class swastic2{
    void dis(){
      int n= 7;
      int m= n/2;
      for(int r= 1;r<=n;r++)
    {
        for(int c= 1;c<=n;c++)
        {
          if (c==m+1 || r==m+1 || r==1&& c>=m+1 || c==1&& r<m+1 || r==n && c<= m+1 || c==n && r>=m+1 ){
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
         
        }
      System.out.println();
    }
    System.out.println("----------------------------------");
     
    for(int r=1;r<=n;r++)
    {
      for(int c=1;c<=n;c++)
      {
        if (c==r ) {
          System.out.print("* ");
        }
        else if (r<=n&&c==n-r+1) {
          System.out.print("* ");
        }
        else{
           System.out.print("  ");
        }
       
      }
      System.out.println();

    }
    System.out.println("------------------------------------------------");
for(int r=1;r<=n;r++)
    {
      for(int c=1;c<=n;c++){
        if ( c==n || r==1  ) 
        {
           System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
       }
       System.out.println();
    }
    for(int r=1;r<=n;r++)
    {
      for(int c=1;c<=n;c++)
      {
        if ( r<=n&&c==n-r+1 || r==n  ) {
           System.out.print("* ");
     
        }
        else{
          System.out.print("  ");
        }
       }
       System.out.println();
    }
    
    }

  }
