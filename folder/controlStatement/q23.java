package controlStatement;

public class q23 
{//The current year and the year in which the employee joined the organization are entered through the keyboard.If
//the number of years for which the employee has served the organization is greater than 3 then a bonus of Rs.2500/-
// is given to the employee . if the years of service are not greater than 3, then the program should do nothing
    public static void main(String[] args) 
    {
        int salary = (int)10000.00;
        int year=5;
        int bonus= 2500;
        if(year>=3)
        {
            
            System.out.println(salary+bonus+" provide a bonus 2500/- add in salary");
        }
        else{
            System.out.println(salary+ " not provide a bonus");
        }
    }
    
}
