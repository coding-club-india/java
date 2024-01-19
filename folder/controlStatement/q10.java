package controlStatement;

public class q10
 {
        // write a program to check whether a character is upercase and lowercase.
    public static void main(String[] args)
     {
        char num = '4';
        if((num>='a'&& num<='z') )
        {
            System.out.println(num +" is  a lowercase character");

        }
        else if((num>='A'&&num<='Z'))
        {
             System.out.println(num +" is  a uppercase character");

        }
        else
        {
            System.out.println(num +" is not a character");
        }
        
    }
    
}
