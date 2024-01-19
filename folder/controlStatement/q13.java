package controlStatement;

public class q13 

{
    // write a program to count total no. of  notes in given ammount.
    public static void main(String[] args) 
    {
        int amount = 2345;
        int x,x1,x2,x3,x4,x5,x6,x7,x8;
        if(amount>=500)
        {
            x= amount/500;
            amount = amount-x*500;
            System.out.println("500 notes quantity "+x+" amount balance "+amount);
        } 
        if (amount>=200)
        {x1= amount/200;
            amount -= x1*200;
             System.out.println("200 notes quantity "+x1+" amount balance "+amount);
        }
        if(amount>=100)
        {
            x2=amount/100;
            amount -= x2*100;
                     System.out.println("100 notes quantity "+x2+" amount balance "+amount);
        }
        if(amount>=50)
        {
            x3=amount/50;
            amount -= x3*50;
             System.out.println("50 notes quantity "+x3+" amount balance "+amount);
        }
        if(amount>=20)
        {
            x4 = amount/20;
            amount=amount-x4*20;
             System.out.println("20 notes quantity "+x4+" amount balance "+amount);
        }
        if(amount>=10)
        {
            x5 = amount/10;
            amount = amount-x5*10;
             System.out.println("10 notes quantity "+x5+" amount balance "+amount);
        }
        if(amount>=5)
        {
            x6= amount/5;
            amount = amount-x6*5;
             System.out.println("5 notes quantity "+x6+" amount balance "+amount);
        }
        if(amount>=2)
        {
            x7=amount/2;
            amount -= x7*2;
             System.out.println("2 notes quantity "+x7+" amount balance "+amount);
        }
        if(amount>=1)
        {      x8 =amount/1;
            amount  -= x8*1;
             System.out.println("1 notes quantity "+x8+" amount balance "+amount);
        }
    }}