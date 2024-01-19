package controlStatement;

public class q25 
{
    //The marks obtained by a student in 5 different subjects are input through the keyboard.The student gets
    // a division as per the following rules: Write a program to calculate the division obtained by the student
    // Percentage above or equal to 60 -First division
    // Percentage between  50 and 59 -second division
    // Percentage between 40 and 49 -third division
    // Percentage between less than 40 - Fail 
    public static void main(String[] args) 
    {
        float h=80,e=56,p=63,c=63,b=68;
        float sum = h+e+p+c+b;
        float s = sum*100/500;
        if(s>=60)
        {
            System.out.println(s+" passed in First division");
        }
        else if(s>=50 && s<=59)
        {
         System.out.println(s+" passed in Second division");
        }
        else if(s >=40 && s <=49){
              System.out.println(s+" passed in Third division");
        } else
        {
            System.err.println("fail");
        }}}
