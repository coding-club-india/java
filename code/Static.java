 
public class Static{
  public static void main(String[] args){
        System.out.println("This is a Static main method");
       int a= Static1.raj();                     // another class method of call
       System.out.println(a);
       System.out.println(capital());             // static method calling     
    Static1.main(args);     // second main method calling to another class 
    }
    static int capital(){
return 3;
    }
}
 class Static1{
public static void main(String[] args) {

    System.out.println("This is  a Static1 main method");
    int a=raj();
    System.out.println(a);     
}
static int raj(){   
    int a= 32;
    int ans = 33;
        System.out.println(a);
    return ans;
}

}