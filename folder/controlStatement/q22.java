package controlStatement;

public class q22 
{
    // while purchasing certain items, a discount  of 10% is offered if the quantity purchased is more than 100. 
   // if quantity and price per item are input through the keybopard,write a program to calculate the total expenses
    public static void main(String[] args) 
    {
      int Qty=1110;
      int dis=10;
      int price= (int) 250;
      double total_dis=price*(100-dis)/100;
      if(Qty>=100)  
      {
        System.out.println(price-total_dis+" is amount achive of discount ");
        System.out.println(Qty*price-Qty*total_dis+ " is amount of achive discount ");
         System.out.println(Qty*total_dis + " is toatl price of product");
      }
      else{
        System.out.println("you can't apply for discount");
      }
    }
    
}
