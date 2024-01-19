import java.util.Scanner;

public class input
{
String j;
       
    public static void main(String[] args) 
    { String j= "joy";
        
         Scanner sc= new Scanner(System.in);
         System.out.print("What is your name = ");
         
         String s= sc.nextLine();

         System.out.print("what is your age = ");
         int age=sc.nextInt();

         System.out.print("What is your gender = ");
         String gender=sc.next();

         System.out.print("what is your salary package = ");
         double salary= sc.nextDouble();
         float a=sc.nextFloat();
         
         System.out.println();
         System.out.println(age);
         System.out.println(gender);
         System.out.println(salary);


    }
}