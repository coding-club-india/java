package memory.folder.controlStatement;

public class q34 {
//A library charges a fine for every book returned late . For first 5 days the fine is 50 paise for 6-10 days fine is 
//one rupee and above 10days fine is 5 rupee.If you return the book after 30 days your membership will cancelled.Write a 
//program to accept the number of days the member is late to return the book and display the fine or the appropriate 
//message

public static void main(String[] argss)
{
    int days=31;
if(days>0 && days<=5)
{
System.out.println("fine is 0.50 paisa");
}
else if(days>=6 && days<=10)
{
System.out.println("fine is 1 rupee");
}
else if(days>10 && days<=30)
{
System.out.println("fine is Five rupee");
}
else
{
    System.out.println("Your membership is cancel");
}
}
    
}
