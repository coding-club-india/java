package file;

public class MP_nagar 
{
    int x;
    class zone1
    {
        String x="Manohar";
        static int a= 20;
     
    }

public static void main(String[] args) 
{
     MP_nagar ref=new MP_nagar();
      System.out.println(ref.x);
     ref.x= 20;
    System.out.println(ref.x);
    zone1 ref1 =  ref.new zone1();
    System.out.println(ref1.x);
        ref1.x= "pradeep";
      System.out.println(ref1.x);
      System.out.println(zone1.a);
     zone1.a= 50;
     System.out.println(zone1.a);
    

   }
    
    
}
