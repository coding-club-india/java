package memory.folder.controlStatement;
public class q6 
{ // write a program to check whether a year is year leap or not .
public static void main(String[] args) 
{
    int num = 200;
    if(num%40==0)
    {
        if(num%100 !=0 || num%100 ==0){
              if(num%400 ==0){
                System.out.println(num+" is a leap year");
               } 
              else{
              System.out.println(num +" is not a leap year");
              }   
        }    
        else{
              System.out.println(num +" is not a leap year");
        }  
    }
    else
    {
      System.out.println(num +" is not a leap year");
    }
 String x=(num%40==0)? num%100 !=0 || num%100 ==0?(num%400 ==0)?(num+" is a leap year"):(num +" is not a leap year"):(num +" is not a leap year"):(num +" is not a leap year");
    System.out.println(x);
  }
}
