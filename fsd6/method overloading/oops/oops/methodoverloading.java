public class methodoverloading {
          // write a program to overlaod your name with differnt job designation job location and company company name
          
          static String vks(String a){
            String company=a;
            String degignamtion="banglore";
            
            return company+" "+degignamtion;
          }
       static String vks(String a,String b){
            String company=a;
            String degignamtion="banglore";
            
            return company+" "+degignamtion;
          }
       
          
    public static void main(String[] args) {
        System.out.println(vks("amazone"));
          System.out.println(vks("microsoft","banglore"));

    }

    // method having same name but change in signature
    // a) change return type
    // b) change the no. of parameter
    // c) type of parameter
    // d) same family ke parameter change karke nahi de sakte hain jese short and int error show hoga

}