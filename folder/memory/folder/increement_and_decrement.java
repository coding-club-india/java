package memory.folder;



public class increement_and_decrement 
   {
    
    public static void main(String[] args) 
    {
            int a =3;
       int y= 6;
       System.out.println(a++);  // a=3    // post increament
       System.out.println(a);    // a=4   
       System.out.println(++a);  //a=5     // pre increament
       int x =5 ;
       int z=  x++ + y++ + x + y;
       System.out.println(z);
       increement_and_decrement xobj =new increement_and_decrement();
       xobj.decreement();
       // post increment
       int b = 5;
       int c= 6;
       int d= b + c++ + c + b + (b++ + b) +c++ +c ; 
       System.out.println(d);
       System.out.println(); 
       

    }
    static void pre_increamnet()
    {
       int a =5;
       System.out.println(++a + a++ );   //6+6 = 12

    }

    void decreement()
    {
        int x = 2;
        int y =4;
        System.out.println(x-- + y-- + --y + y);

       
    }
}
