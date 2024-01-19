package controlStatement;

public class q24 
{
    //if his basic salary is less than Rs.1500,then HRA = 10% of basic salary and DA= 90% of basic salary.if his salary is either to or 
    // above Rs.1500, then HRA= Rs.500 and DA = 98% of basic salary.if the employee's salary is input through the keyboard write a
    // program to find his gross salary.


    public static void main(String[] args) 
    {
      int salary= 150;
      double HRA=salary*10/100;
        double DA = salary*90/100;
        double HRA1=salary+500;
        double DA1=salary*98/100;
      if(salary<1500)
      {
        //double HRA=salary*10/100;
       // double DA = salary*90/100;
        System.out.println(salary+HRA+DA+" provoide a employee salary");
      }
      if(salary>=1500)
      {
       // double HRA=salary+500;
        //double DA=salary*98/100;
        System.out.println(salary+HRA1+DA1+" provoide a employee salary");
      } 
      String x= salary<1500?salary+HRA+DA+" provoide a employee salary":salary>=1500?salary+HRA1+DA1+" provoide a employee salary": "not";
    System.out.println(x);
    }
    
}
