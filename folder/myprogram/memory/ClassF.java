package memory.folder.myprogram;

public class ClassF {
    int c;
    static int e;
    ClassF()
    {
        System.out.println(++c);  //1
        System.out.println(++e);   //1
    } 
    public static void main(String[] args) {
        int a = 34;
        int b= 21;
        new ClassF().c=a++ + ++b;    //34+22=56 // 35+22
        int d = --a + --b + new ClassF().c--; //34+21+56=111//34+21+55
        e= a+b + new  ClassF().c+ d--;//34+21+55+111=221 //34+21+55+110
        int f =-a + b-- + -new ClassF().c - d++;//f-34+21-55-110=-89//34+20+55+111
        int sum = a+b+ new ClassF().c+d+e+f;//34+20+55+111+221-89
        System.out.println("sum ="+sum);
    }
    
}
