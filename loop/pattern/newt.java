public class newt
{ 
    public static void main(String[] args) {
        int a=4;
    for(int r=1 ,p=1;r<=a;r++,p+=2){
        for(int c=1;c<=r;c++){
            System.out.print(p+" ");
            
        }
        System.out.println();
    }
    for(int r=1,p=5; r<=a;  r++, p-=2){
      for(int c=r;c<a;c++){
          System.out.print(p+" ");
      }
        System.out.println();
    }
    }
    
}
