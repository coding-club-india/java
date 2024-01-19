package controlStatement;

public class q19 
{
        //     write a program to input marks of five subject p,c,b,m and computer. calculate percentage and grade 
        //     according to following:
        //     percentage >=90% : Grade A
        //     percentage >=80% : Grade B
        //     percentage >=70% : Grade C
        //     percentage >=60% : Grade D
        //      percentage >=50% : Grade E
        //      percentage <=40% : Grade F    
    public static void main(String[] args)
     {
        int p = 40,c=40,m=40,b=40,co=40;
        float sum_marks = p+c+b+m+co;
        float marks = (sum_marks)*100/500;
        if(marks>= 90)
        {
           System.out.println(marks +"% is obtained a A grade");
        }
        
       else  if(marks>= 80)
        {
           System.out.println(marks +"% is obtained a B grade");
        }
       else if(marks>= 70)
        {
          System.out.println(marks +"% is obtained a C grade");
        }
       else if(marks>= 60)
        {
          System.out.println(marks +"% is obtained a D grade");
        }
       else if(marks>= 50)
        {
         System.out.println(marks +"% is obtained a E grade");
        }
        else if(marks>= 40)
        {
          System.out.println(marks +"% is obtained a F grade");
        }
        else
        {
             System.out.println(marks +"% is  Fail a student ");
        }
}
}
