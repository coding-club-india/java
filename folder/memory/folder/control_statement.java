package memory.folder;


public class control_statement
 {
    
    public static void main(String[] args) 
    {





       leap_year();
       control_statement xobj = new control_statement();
        xobj.ternary_operator();

    }
    static void leap_year()
    {
       int year = 2000;
      if(year%4 ==0)                                                //  remainder is 0 =0 condition is true
      {

        if(year%400 ==0)                                            //  remainder is 0 = 0 condition is true
        {
               System.out.println("It is a leap year");           //  print

        }
       else if(year%100 !=0 )                                        // not read 
       {
             System.out.println(" IT IS NOT LEAP YEAR");
       }

      }
      else{                                                        // not read
        System.out.println("It is not a leap year");

      }
      System.out.println("work is completeted ");                 // print
 
    }
    void ternary_operator()
    {
    
        int year = 2004;

      // condition ? expresion 1 : expresion 2;
       String y = year%4 ==0 ? year%400 ==0 ? "It is a leap year" :year%100 !=0 ?" IT IS not LEAP YEAR " :" it is  a leap year " :"It is not a leap year";
       System.out.println(y);

    }     

     static void method1()
    {
    
     int x= 12;
     if( x>0)
     {
        System.out.println("It is a positive number");

     }
     else if(x<0)
     {
           System.out.println("It is a negative number");
     }
     else if (x==0)
     {
       System.out.println("it is zero number");      
     }
     else{

     }
    
  
    // condition? Expression 1:Expression 2;

     String s= x>0 ? " It is a positive number " :x<0? " it is a negative number ":x==0? "it is zero number": "its not a zero";
    System.out.println(s);
    }

}
