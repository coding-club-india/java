package file;


public class Lnct 
{
    int a;
    public static void main(String[] args) 
    {
        Lnct ref0=new Lnct();
        Lnct.it ref1 = ref0.new it();
        Lnct.it.cs ref11 = ref1.new cs();
        Lnct.it.informationTec ref12 = ref1.new informationTec();
        Lnct.mechanical ref2 = ref0.new mechanical();
        Lnct.civil ref3 = ref0.new civil();
        Lnct.electronics ref4 = ref0.new electronics();
        System.out.println("--------------------------Lnct main class--------------------");
        System.out.println(ref0.a);
        System.out.println("-----------------------Lnct it  ----------------------------");
        System.out.println(ref1.b);
        System.out.println(it.a);
        it.a= 20;
        System.out.println(it.a);
        System.out.println("-----------------------Lnct it cs---------------------------------");
        System.err.println(ref11.a);
        ref11.dbms();
        System.out.println("------------------lnct it information tec-------------------- ");
        ref12.data_structure();
        System.out.println(ref12.b);
        ref12.b=40;
        System.out.println(ref12.b);
        System.out.println("-------------------------mechanical-------------------------");
        System.out.println(ref2.a);
        System.out.println("--------------------------Lnct civil---------------------------");
        System.out.println(ref3.c);
        System.out.println("--------------Lnct electronics----------------------------");
        System.out.println(ref4.z);
        System.out.println("========================>  Lnct classes End <===========================");
            System.out.println();
            System.out.println();
            System.out.println("==============================>jnct class object starts<=========================");

        jnct r0 = new jnct();
        jnct.it r1= r0.new it();
        jnct.it.cs r11= r1.new cs();
        jnct.it.informationTec r12 = r1.new informationTec();
        jnct.mechanical r2 = r0.new mechanical();
        jnct.civil r3=r0.new civil();
        jnct.electronics r4= r0.new electronics();
        
        System.out.println("--------------------Jnct-----------------------");
        System.out.println(r0.M);
        System.out.println("--------------jnct it-------------------");
        System.out.println(r1.b);
        System.out.println("---------------jnct it cs------------------");
        System.out.println(r11.a);
         r11.a= 40;
         System.out.println(r11.a);
         r11.dbms();
         System.out.println("---------------jnct it information Tzecnology-----------------");
         System.out.println(r12.b);
         r12.data_structure();
         System.out.println("----------------jnct mechanical------------------");
         System.out.println(r2.z);
         System.out.println("--------------------jnct civil----------------");
         System.out.println(r3.c);
         System.out.println("----------------electronics-------------------------------");
         System.out.println(r4.c);
         r4.circuit();
         System.out.println();
        

    }
    class it
    {
        int b;
        static int a=50;
     class cs
     {
        int a = 10;
        void dbms()
        {   
            System.out.println("---------------Lnct it cs ------------");
            System.out.println("--------------------dbms --------------");
        }

     }
     class informationTec
     {
        int b=20;
      void data_structure()
       {
          System.out.println("---------------Lnct it informationTec ------------"); 
          System.out.println("-------------------data structure--------------------");
       }
     }
    }
    class mechanical
    {  int a;
      void  system()
      {

      }
    }
    class civil
    {  int c = 20;
        void build()
        {

        }

    }
    class electronics
    {  int z= 30;
      void circuit()
      {

      }
    } 

}



class jnct
{
    String M = "Manohar";
     class it
    {
        int b;
     class cs
     {
        int a = 10;
        void dbms()
        {
            System.out.println("---------------------jnct it cs---------------------");

        }

     }
     class informationTec
     {
        int b=20;
      void data_structure()
       {
            System.out.println("------------------------jnct it informationTec----------------------");
       }
     }
    }
    class mechanical
    {
        int z=40;
      void  system()
      {

      }
    }
    class civil
    {int c=50;
        void build()
        {

        }

    }
    class electronics
    {
        String c="raj";
      void circuit()
      {
        System.out.println("=================>  Jnct class end <=======================");
      }
    } 



}
