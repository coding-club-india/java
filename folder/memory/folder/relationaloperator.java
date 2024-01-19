package memory.folder;


public class relationaloperator 
{
        public static void main(String[] args)
    {
        int a = 42;
        int b= 30;
        System.out.println(a<b);  // its lessthan operator and answer is false
     System.out.println(a>b);     // its greater than operator and answer is true
     System.out.println(a==b);    //its equal or equal operator and aanswer is false
     System.out.println(a>=b);    //its greater or equal operator and answer is true
     System.out.println(a<=b);    //its less than or equal operator and answer is false 
     System.out.println(a!=b);    //its not or equal operator and answer is true
        logicaloperator();
    }
    static relationaloperator logicaloperator()
    {
      int a = 50;
      int b = 40;
      System.out.println((a<b)&&(a>b)); // logical  AND operator and answer is false
      System.out.println((a>b)||(a<b)); // logical OR operator and answer is true
      System.out.println(!(true));      // logical NOT operator and answer is false   // logical operator ke liye operator true or false hota hain  
      assignoperator();
      return null;
    }
    static void assignoperator()
    {
         int x= 5;
        x+=3;     //x =x+3;
        System.out.println(x);
        x-=5;      // x= x-5;
        System.out.println(x);
        x *= 5;       // x=x*5 ;
        System.out.println(x);
        x %= 4;     //  x= x%4;
        System.out.println(x);
       relationaloperator yobj = new relationaloperator();
       yobj.bitwiseoperator();
      }
      void bitwiseoperator()
      {
         int x=46;
         int y=36;
         System.out.println(x|y);   // it is a bitwise OR operator answer is 46 
         System.out.println(x^y);   // its a XOR operator answer is 10
         System.out.println(x&y);   // its a bitwise AND operator answer is 36
         System.out.println(x<<2);  // its a leftbitwise operator answer is 184
         System.out.println(y>>1);   // its a right shift bit wise operator answer is 18
         System.out.println(+3);
      }
   }