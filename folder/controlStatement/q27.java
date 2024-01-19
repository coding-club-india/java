package controlStatement;

public class q27 
{//write the calculate to the salary as per the following table
    //    Gender     year of service    Qualifications            salary
    //     male      >=10               post-Graduate              15000
    //     male      >=10                graduate                  10000
    //               <10                 post graduate             10000
    //               <10                graduate                   7000
    //    female     >=10               post graduate              12000
    //               >=10                graduate                  9000
    //                <10                post graduate             10000
    //                <10                graduate                  6000
    public static void main(String[] args) 
    {
        String Gender="female";
        int service = 8;
        String Qf="g";
        if(Gender=="male")
        {
        if( service>=10 && Qf=="p-g")
        {
            System.out.println("provide a 15000 salary");
        }
        else if( service>=10 && Qf=="g")
        {
            System.out.println("provide a 10000 salary");
        }
        else if( service<10 && Qf=="p-g")
        {
            System.out.println("provide a 10000 salary");
        }
        else
        {
            System.out.println("provide a 7000 salary");
        }
    }
     else{
         if( service>=10 && Qf=="p-g")
        {
            System.out.println("provide a 12000 salary");
        }
        else if(service>=10 && Qf=="g")
        {
            System.out.println("provide a 9000 salary");
        }
        else if(service<10 && Qf=="p-g")
        {
            System.out.println("provide a 10000 salary");
        }
        else 
        {
            System.out.println("provide a 6000 salary");
        }
    }
    String x=Gender=="male"? service>=10 && Qf=="p-g"?"provide a 15000 salary":service>=10 && Qf=="g"?"provide a 10000 salary":service<10 && Qf=="p-g"?"provide a 10000 salary":"provide a 7000 salary":service>=10 && Qf=="p-g"? "provide a 12000 salary":service>=10 && Qf=="g"?"provide a 9000 salary":service<10 && Qf=="p-g"?"provide a 10000 salary":"provide a 6000 salary" ;
   System.out.println(x);
}   }
