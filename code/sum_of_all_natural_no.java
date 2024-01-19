package memory;

public class sum_of_all_natural_no            // class
{
   static long all_number(long n)              // static method sum of all natural no.
   {
long ans = n*(n+1)/2 ;
return ans ;                                  // return static method to integer no.
   }
    static long even_no(int a)                // static method sum of all even no.
    {
     int ans = a*(a+1) ;
     return ans;                              //return  integer no. 
    }

 static int square( int a)                    // static method square of five
 {

int ans = a*a;
return ans ;                                  // return integer 
 }
    long sum_of_all_no( int a)                // it is a non static method for sum of all natural no.
    {
     long ans = (a*(a+1))/2 ;


     return ans ;                             // non-static method return integer no.
    }
   long square62( int d)
    {
      long ans = d*d ;

        return ans;
    }



                    /******* start main method *********/
                    
                    
    public static void main(String[] args) 
    {
        int n = 100 ;               // local variable
        int a = 5 ;                 //local variable
        
        int sq = square(a);         // sq assign square static method
        long b= all_number(n);      //b assign all number static method
        int d = 62 ;                // local variable
         sum_of_all_natural_no yobj = new sum_of_all_natural_no(); // calling a non static method
        int sq62 = (int) yobj.square62(d);                         // sq62 assign square62 method call  
        sum_of_all_natural_no xobj = new sum_of_all_natural_no();  //calling a non static method
        long c = xobj.sum_of_all_no(n);                            // c assign sum of all no. non static method
        System.out.println("sum_of_all_natural_no = " + b);        // print static method
        System.out.println("sum_of_all_even_no = " + even_no(n));  //print static method
        System.out.println("sum_of_all_natural_no_nonstatic method = " + c ); //print nonstatic method
        System.out.println("square of five = "+ sq);               // print 
        System.out.println("Square of 62 = " + sq62);              // print
         
    }
}
