public class object_practise 
{     
    String state;         // instance variable 
    String capital;       // instance variaBLE
    object_practise(String A , String B)// its a constractor every parameterized object call 
    {
      state = A;             
     capital= B;
    }
    public static void main(String[] args) // main method  
    {
         object_practise MP = new object_practise("MP","bhopal");// create paramerized object and input the argument
        object_practise UP = new object_practise("UP","lucknow");// create paramerized object and input the argument

        object_practise Maharastra = new object_practise("Maharastra","mumbai");// create paramerized object and input the argument
        System.out.println( MP.state+" "+MP.capital );             //print the state name & capital city name
        System.out.println( UP.state+" "+UP.capital);           //print the state name & capital city name
        System.out.println( Maharastra.state+" "+Maharastra.capital);  //print the state name & capital city name
    }
}
