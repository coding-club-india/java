public class day 
{

    static public void vk()
    {

    }
    
    public static void main(String[] args) {
        day r1= new day();
        day.A r11 = r1.new A();
       day.A.C r111 = r11.new C();
       r111.vikash();
       System.out.println(r111.vikash());



       D ref2 = new D();
    
       D.E ref21 = ref2.new E();
       D.E.F ref211 =ref21.new F();
    
        System.out.println(ref2.i);
    }
    
    class A{

        class C{
              int v = 34;
            double vikash()
            {
                int h=67;
               C aobj = new C();
               
               System.out.println(h);
               
                return 90.9;
            }

        }
    }
}
class D{

int i= 90;
class E{

    class F
    {

    }
}

}
