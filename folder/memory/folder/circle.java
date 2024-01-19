package memory.folder;

public class circle 
{

    static short area(short a ,short b)
    {
      short ans = (short) (a*b) ;
       return ans ;
    }
   
       public static void main(String[] args) {
            short r = 3*3;
            short y = 22/7 ; 
            short c = area(r,y); 
            System.out.println("circle formula ="+ c);
       }
    
}
