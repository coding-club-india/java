 

public class fan 
{
     int blades = 3;
     String color = "white";
     float cost= 1800;
     String  brand = "usha";
     void rotate(){
      System.out.println("the fan is ratating");
    }
    void on (){
System.out.println("the fan is on");
    }
    void off(){
System.out.println("the fan is off");
    }
     
    public static void main(String[] args)
     {
     
     fan obj= new fan();
     System.out.println(obj.blades);
     System.out.println(obj.cost);
     System.out.println(obj.color);
     System.out.println(obj.brand);
     obj.rotate();
     obj.on();
     obj.off();
    }
}