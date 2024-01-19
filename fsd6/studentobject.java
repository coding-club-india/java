public class studentobject {
      String name= "ajay";
      int age=20;

    public static void main(String[] args) {
        studentobject obj=new studentobject();
        System.out.println("Student name is : "+obj.name);
        System.out.println("Student age is : "+obj.age);
        obj.eat();
        obj.slip();
        obj.study();
    }
    void slip()
    {
     System.out.println("student  sleep  ");
    }
    void eat()
    {
 System.out.println("student  eat food ");
    }
    void study()
    {
        System.out.println("student  study in coaching  ");
    }
}