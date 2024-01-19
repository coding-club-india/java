package memory.folder.controlStatement;

public class q7 
{
    // write a program to check whether charACTER is alphabet or not.
    public static void main(String[] args) 
    {
        char num = 123;
        if((num>='a'&& num<='z')||(num>='A'&&num<='Z')||num>=65 && num<=90|| num>=97 && num <= 122 )
        {
            System.out.println(num +" is  a alphabet");

        }
        else
        {
             System.out.println(num +" is  not a  alphabate");

        }
      //  String x =(num>='a'&& num<='z')||(num>='A'&&num<='Z') ?(num +" is  a character"):(num +" is  not a character");
    //System.out.println(x);
    }
    
}
