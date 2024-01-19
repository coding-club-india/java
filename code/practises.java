
public class practises 
{
    int size;
    int lenght;
    int height;
    practises(int a,int b, int c)
    {
       size=a;
       lenght= b;
       height=c;
    }
   
    practises(int a,int b)
    {
        size=a;
       lenght= b;
    }
     practises()
    {
        
    }
   
     
    public static void main(String[] args)
     {
        practises aobj=new practises(64,8);
        System.out.println(aobj.size+" "+aobj.lenght);
        System.out.println("-----------------------------------------------------------------------");
        
        practises xobj=new practises();
        int a=xobj.ram();
        System.out.println("practises class main fuction calling to ram class inside of practises class "+a);    
        System.out.println("-----------------------------------------------------------------------");
        radhe.main(args);
    }
    int ram()
{
    practises x= new practises(144,12,12);
    System.out.println("ram method inside of practise class "+x.size+" "+x.lenght+" "+x.height );
    System.out.println("-----------------------------------------------------------------------");
    return 0;
}
     class radhe 
     {
     radhe()
        {
        
        }
       

    
       public static void main(String[] arg) 
     { 
           practises x=new practises();
         
           shyam();
            System.out.println("ram method inside of radhe class ");
            }


         static  int shyam(){
          System.out.println("its method ram inside of radhe class and calling radhe main method");
           return 0;

       }
    }
   

}
