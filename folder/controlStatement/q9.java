package controlStatement;

public class q9 
{
    // write a program to input any character or check whether is a alphabet , digit 0r specisal character.
    public static void main(String[] args) 
    {
        int num = 5000 ;
        if((num == 'a'||num=='A') ||(num=='e'||num=='E')||(num=='i'||num=='I')||(num=='o'||num=='O')||(num=='u'||num=='U'))
        {
            System.out.println(num + (" is vowels alphabet"));

        }
        else if(((num>='b')&&(num<='d')||(num>='B')&&(num<='D'))||((num>='f')&&(num<='h')||(num>='F')&&(num=='H'))||((num>='j')&&(num<='n')||(num>='J')&&(num<='N'))||((num>='p')&&(num<='t')||(num>='P')&&(num<='T'))||((num>='v')&&(num<='z')||(num>='V')&&(num<='Z')))
        {
          System.out.println( num + " is a consonant");
        }
        else if(num>=0||num<=0)
        {
            System.out.println( num + " is a integer number");
        }
        else if((num == '#')||(num== '@' )||(num == '$')||(num== ',' )||(num == '^')||(num== ':' )||(num == '_')||(num== '?' )||(num== ';' )||(num== '`' )||(num== '.' ))
        {
               System.out.println(num +" is a special operator");
        }
        else if((num=='+')||(num=='-')||(num=='*')||(num=='/')||(num=='%'))
        {
            System.out.println(num + " is a arithmatic operator");
        }
        else if((num=='|')||(num=='&')||(num=='~'))
        {
            System.out.println(num +" is a bitwise operator");
        }
        else 
        {
            System.out.println(num +" is a other operator");
        }
    }
    
}
