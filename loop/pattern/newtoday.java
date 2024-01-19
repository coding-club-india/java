import java.util.*;
import java.util.Scanner;
public class newtoday
{
 
    public static void main(String[] args)
    {
         System.out.println("-------------------incrising order----------------------");
        today aobj=new today();
        aobj.main();


        
        System.out.println("-------------------Decreesing order----------------------");
        int a=4;
        for(int r=1;r<=5;r++){
     for(int c=1;c<=(a-r)+1;c++)
     {
          System.out.print("* ");
     }
     System.out.println();
    }
           System.out.println("-------------------mix combine----------------------");
        for(int r=1;r<=5;r++)
         {
              for(int c=1;c<=r;c++)
              {
                 System.out.print("* ");
              }
                 System.out.println();
         }
        
        int b=4;
        for(int r=1;r<=5;r++){
           for(int c=1;c<=(b-r)+1;c++)
          {
           System.out.print("* ");
          }
              System.out.println();

          }

    System.out.println("------------------------combine second way---------------------------");
        int d=4;
        for(int r=0;r<=5;r++){
     for(int c=0;c<=d-r+1;c++)
     {
          System.out.print("* ");
     }
     
     System.out.println();
    }
   
    for(int r=2;r<=5;r++)
    {
    for(int c=1;c<=r;c++)
    {
        System.out.print("* ");
    }
    System.out.println();
      }

    }
}
class today
{
    void main()
   {
    for(int r=1;r<=5;r++)
     {
         for(int c=1;c<=r;c++)
           {
                  System.out.print("* ");
           }
         System.out.println();
      }


    }

}
