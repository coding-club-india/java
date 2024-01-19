package memory.folder.controlStatement;

public class q8 
{
     // Write a program to input a any alphabet to check vowels or not.
    public static void main(String[] args) 
    {
        
        
        char num = '1' ;
        if((num == 'a'||num=='A') ||(num=='e'||num=='E')||(num=='i'||num=='I')||(num=='o'||num=='O')||(num=='u'||num=='U'))
        { 
            System.out.println(num + (" is vowels alphabet"));

        }
        else if(((num>='b')&&(num<='d')||(num>='B')&&(num<='D'))||((num>='f')&&(num<='h')||(num>='F')&&(num=='H'))||((num>='j')&&(num<='n')||(num>='J')&&(num<='N'))||((num>='p')&&(num<='t')||(num>='P')&&(num<='T'))||((num>='v')&&(num<='z')||(num>='V')&&(num<='Z')))
        {
          System.out.println( num + " is a consonant");
        }
        else
        {
            System.out.println( num + " is not a alphabet");
        }  
        
    }
    
}
