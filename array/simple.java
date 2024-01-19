public class simple {

    public static void main(String[] args) {
        int [] arr= new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;     
        arr[2]= 100;  // value update runtime is possible
       // arr[5]= 150;   // data is not increase/decrease the list from array is run time/this is not applicable
        System.out.println(arr[2]);
    }
}
class A{

    void array()
    {     // multitype of declare arraY
        int [] arr= {1,2,3,4,5};

        int [] arr1= new int [] {10,20,30,40,50};

        int arr2[] = {1,2,3,4};

       // int []arr3 = new int [];   error
       // arr3={1,2,3,4};

       int []arr4=new int[]{1,2,3};

       int arr5[] = new int[]{1,32,3};

       int []arr3 = new int [5];  
       arr3[0]=1;
       arr3[1]=2;
    }
}