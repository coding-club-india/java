public class overriding   // method overriding meanse :- Method having same name when extend from its parents    but change in implementation in its child class  that is overriding
{
     class A{
       
        void display()
        {
            System.out.println("class A");
            System.out.println("class D");
        }
        void dis()
        {
            System.out.println("class A");
            System.out.println("class D");
        }
}
class B extends A{              // this is overriding becuase main method through child class ko call kiya ja raha hain or child class method name same hain parent class ke name ke 
         void display()  // this is @overriding
         // overrididng through parent class ki properties ko child class through access kar sakte hain
        {
            System.out.println("class B");
        }
}

    public static void main(String[] args) 
    {
        overriding obj = new overriding();
        B b=obj.new B();
        b.display();
        b.dis();
    }
}
