package memory;
public class Twenty_third
{
    int dhoni;
    int virat;
   
    Twenty_third(){
     
    }
    Twenty_third(int a,int b){
       dhoni= a;
       virat= b; 
    }
    public static void main(String[] args){
        Twenty_third x=new Twenty_third();
         x.india();
         srilanka y = new srilanka();
         y.srilank();
        
    }
    void india(){
      Twenty_third x= new Twenty_third(88,92);
           System.out.println(x.dhoni);
           System.out.println(x.virat);
}   
}
class srilanka{
 
   int bumrao;
    int sami;
    srilanka(){
    }
  srilanka(int a,int b)
  {
    bumrao=a;
    sami= b;
    }
void srilank(){
      srilanka x= new srilanka(5,3);
      System.out.println(x.bumrao);
      System.out.println(x.sami);
}}
