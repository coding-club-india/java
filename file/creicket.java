
// create two nonstatic method india & srilanka . create object inside of object in srilanka & india 
public class creicket 
{   
    int virat;
    int gill;
   creicket(){

   }
    creicket(int x,int y){
        virat = x;
        gill = y;
       
    }

    public static void main(String[] args)
    {
      creicket virat= new creicket();
          virat.India();
    //  creicket2 a=new creicket2();
        // creicket2.srilanka();
    }
    
    void India()
{
     creicket y= new creicket(88,92);
     System.out.println(y.x);
     System.out.println(y.y);
}


}



/*class creicket2
{
    int bumrah ;
    int sami;
    creicket2()
    {

    }
    creicket2(int a,int b)
    {
         bumrah=a;
         sami=b; 
    }

static void srilanka()
{
    creicket2 x= new creicket2(1,5);
    System.out.println(x.a);
     System.out.println(x.b);
}
}
*/