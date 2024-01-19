package controlStatement;

public class q20 
{
     // write a program to input basic salary of an employee and calculate its Gross salary according to following:
     //  Basic Salary <=10000:HRA = 20%, DA= 80%
     //  Basic Salary <=20000:HRA = 25%, DA= 90%
     //  Basic Salary <=30000:HRA = 30%, DA= 95%
       public static void main(String[] args) 
    {   
        int salary=(int)8000.0;
        if(salary>=10000&&salary<20000)
        {
          double HRA=(salary*20)/100;
          double DA=(salary*80/100);
          System.out.println(salary+HRA+DA+" Provide a employee salary");   
        }
        else if(salary>=20000&&salary<30000)
        {
               double HRA=salary*25/100;
               double DA=salary*(90/100);
               System.out.println(salary+HRA+DA+" Provide a employee salary");
        }
        else if(salary>=30000)
        {
            double HRA=salary*30/100;
            double DA=salary*95/100;
            System.out.println(salary+HRA+DA+" Provide a employee salary");
        }
        else
        {
            System.out.println(salary +" provide a employee salary");
        }
    }
}
