package memory.folder;

public class operator 
{


static int addition(int x,int y)
 {

int ans = x+y;
return ans;
  
}

static int substraction(int c,int d)
 {

int ans = c-d;
return ans;
   
}

static int multiplication(int e,int f)
{

int ans = e*f;
return ans;
   
}

 static int division(int l,int m)
{

int ans = l/m;
return ans;
}


public static void main(String[] args)
 {
  int a = 50;
  int b = 20;
  int j = addition(a,b);
  int h = substraction(a,b);
  int i = multiplication(a,b);
  int k = division(a,b);
  System.out.println("addition ="+ j);
  System.out.println("substraction ="+ h);
  System.out.println("multiplication ="+i );
System.out.println("division ="+ k);
}



}
