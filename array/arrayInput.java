import java.util.Scanner;
public class arrayInput {
// singal dimentional array
    public static void main(String[] args) {
        string();
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter the no. of size: "); 
     int size = sc.nextInt();
     //creation of empty array object
     int [] arr= new int [size];
     //input element inside on array
     for(int i= 0;i<size;i++)
     {
        System.out.println("Enter the element: ");
        arr[i]= sc.nextInt();
     }

     // display array elements
     for(int a: arr)
     {
        System.out.print(a+" ");
     }
    }
 static void string()
 {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the no. of size: "); 
   // sc.nextLine();
    int size = sc.nextInt();
    //creation of empty array object
    String [] arr= new String [size];
    //input element inside on array
    for(int i= 0;i<size;i++)
    {
       System.out.println("Enter the element: ");
       sc.nextLine();
       arr[i]= sc.nextLine();
    }

    // display array element
    for(String a: arr)
    {
       System.out.print(a);
    }  
 }


}

