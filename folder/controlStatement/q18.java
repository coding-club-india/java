package controlStatement;

public class q18 
{// write a program to calculaate profit or loss
    public static void main(String[] args) 
    {
        int cost = 500;
        int sell = 500;
        if(cost>sell)
        {
           System.out.println(cost - sell + " is amount of loss");
        }
        else if(cost<sell)
        {
           System.out.println(sell - cost + " is amount of profit");
        }
        else
        {
            System.out.println(sell - cost +" selling price and purchasing price both are same so that no profit no loss");
        }
    }
    
}
