package keyword;

/**
 * thisKeyword
 */
// 
public class thisKeyword {
    int rollno= 10;
    String name="raj";
    int age = 50;
    thisKeyword(int rollno,
    String name,
    int age)
    {
        // rollno = rollno;           // constructor parameter and instance variable same ho to name clash hota hain or fisrt primarry instance variable ko priority deta hain isi problem ko dur karne ke liye hum this keyword ka use karte hain 
         // hamara jvm confuse na ho isi ke liye hum this keyword ka use karte hain
         // this keyword objects refference ko detect karta hain
       //  name=name;
        // age=age;
        this.rollno=rollno;
        this.name=name;
        this.age=age;

    }
    public static void main(String[] args) {
    //   thisKeyword o1= new thisKeyword(1,"Ankit", 21)  ;
    //   thisKeyword o2= new thisKeyword(2,"Rahul", 20)  ;
    //   o1.display();
    //   o2.display();
    // System.out.println("----------------------------");
    // student s1= new student();
    // s1.y();
    System.out.println("----------------------------");
    next s= new next(1,"ram",50);
    
    next s1= new next(1,"ram",50,50.5f);
    s1.display();


    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+age);
    }
    
}
class student{


    void x()
{
    System.out.println("hello x");
}
void y()
{  // this.x(); 
   x();  // atomatic this ko le raha hain that is region of without refference calling success
   //x(this); error show  

}

}

class next{
    int rollno;
    String name;
    int age;
    float fee;
    next(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    next(int rollno,String name,int age,float fee)
    {
     this(rollno,name,age);     // this is constructor calling help of this keyword
     this.fee=fee;
    }

    void display()
    {
    System.out.println(rollno+" "+name+" "+age+" "+fee);
    }
}
