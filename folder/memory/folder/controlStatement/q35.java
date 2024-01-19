package memory.folder.controlStatement;

public class q35 
{
//In a company ,wroker efficiency is determined on the basis of the time required for a worker to complete a particular
//job.If the time taken by the worker is b/w 2-3 hours then the worker is said to be highly efficient.If the time required 
//by the worker is b/w 3-4 hours,then the worker is odered to improve speed if the time taken is bt/w 4-5 hours the
// worker is given training to improve his speed, and if the time taken by the worker is more than 5 hours, then the 
//worker has to leave the company.If the time taken by the worker is i/p through the keyboard,findthe efficiency of 
//the worker 
    public static void main(String[] args) 
    {
        double hours = 6;
        if(hours>=2 && hours <=3)
        {
          System.out.println("Your working speed is good/your efficiency is good"); 
        }
        else if(hours>=3 && hours<=4)
        {
              System.out.println("improve your speed");
        }
        else if(hours>=4 && hours<=5)
        {
          System.out.println("last warning improve your skill");
        }
        else
        {
            System.out.println("You are suspended");
        }
        
    }
    
}
