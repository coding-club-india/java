public class constractor    
{                           // object create inside of class
    int a= 20;    //instance variable        // instance variable create inside of object/class

    constractor(){

    }
    static void ram()
    {
        constractor obj= new constractor();

    }

    public static void main(String[] args) 
    {                                                   // object always inside of heap memory 
      constractor vks = new constractor(); 
      constractor ram = new constractor();
      constractor sid = new constractor();                                                // constractor name same always class name 
       System.out.println(vks);                                                  // constractor return never anything
                                                          //  if class create hoti hain to class ke inside constractor bhi create hota hain internally
                                                         // 
    }
    class S_C_T{



S_C_T()
{

}

    }
    
}
class ct{

    ct(){

    }


}
