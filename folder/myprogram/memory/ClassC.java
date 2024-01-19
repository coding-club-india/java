package memory.folder.myprogram;

public class ClassC 
{
    static
    {
        System.out.println("1st static block execute");
    }
    public static void main(String[] args) {
        System.out.println("main() called");
    }
    static{
        System.out.println("2nd static block execute");
    }
    
}
