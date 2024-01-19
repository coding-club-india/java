package controlStatement;

public class q29 
{//if the ages of Ram Shyam and Ajay are input through the keyboard,write a program to determine the youngest of the 3 
  
    public static void main(String[] args) {
        int ram= 30,shyam=40,ajay=37;
        if(ram<shyam&& ram<ajay )
        {
          System.out.println("Ram is youngest");
        }
        if(shyam<ram && shyam <ajay)
        {
      System.out.println("Shyam is youngest");
        }
        if(ajay<ram && ajay<shyam)
        {
       System.out.println("Ajay is youngest");
        }
    }
}
