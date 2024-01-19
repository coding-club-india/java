public class test 
{
    int data=10;


/// call by refference
// class name is a user defined datatype



void change(test t1){
  t1.data = t1.data +100;
}

    public static void main(String[] args) {
        test t1=new test();
        System.out.println("before calling "+t1.data);
        t1.change(t1);
        System.out.println("before calling "+t1.data);
    }
}
