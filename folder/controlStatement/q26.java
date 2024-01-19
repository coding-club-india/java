package controlStatement;

public class q26 
{//A company insures its drivers in the following cases:
// if the driver is married 
//if the driver is unmarried , male & above 30 years of age
// if the driver is unmarried , female &above 25 years of age
public static void main(String[] args) 
{
    String married="unmaried";
    int age = 20;
    String gender = "male";



    if(married=="married"||married=="unmaried"&& gender=="male" &&age>=30||married=="unmarried"&&gender=="female"&&age>=25)
    {
    System.out.println("you eligibel to insurance");
    }
    else
    {
        System.out.println("you are not eliggible for insurance");
    }
    String x=(married=="married"||married=="unmaried"&& gender=="male" &&age>=30||married=="unmarried"&&gender=="female"&&age>=25)?"you eligibel to insurance":"you are not eliggible for insurance";
 System.out.println(x);
    
}
    
}
