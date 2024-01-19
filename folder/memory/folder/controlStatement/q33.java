package memory.folder.controlStatement;
public class q33{
//A certain grade of steel is graded according to the following conditions
    //i - Hardness must be greater than 50
    //ii-Carbon content must be less then 0.7
    //iii- Tensile stenght must be greater than 5600
    //  The grades are as follows: 
    // Grade is 10 if all three conditions are met
    // Grade is 9 if condition (i)and(ii) are met
    //Grade is 8 if condition (i)and (iii)are met
    //Grade is 7 if condition (i)and (iii)are met
    //Grade is 6 if only one condition is met
    //Grade is 5 if none of thecondition are met
//Write a program ,which will require the user to give values of hardness carbon contend and tensile stength of the 
//steel undder consideration and output the grade of the steel    
    public static void main(String[] args) {
    int hard=48;
    double Ca= 0.6;
    int stenght=56000; 
    
    if(hard==50 && Ca == 0.7 && stenght==5600)
    {
      System.out.println("Steel is Grade of 10");
    }
    else if(hard==50 && Ca == 0.7)
    {
       System.out.println("Steel is Grade of 9");
    }
    else if(hard==50 && stenght==5600)
    {
       System.out.println("Steel is Grade of 8");
    }
    else if(hard==50 && stenght==5600)
    {
       System.out.println("Steel is Grade of 7");
    }
    else if(stenght==5600)
    {
       System.out.println("Steel is Grade of 6");
    }
    else if(hard==50)
    {
       System.out.println("Steel is Grade of 6");
    }
    else if(Ca==0.7)
    {
       System.out.println("Steel is Grade of 6");
    }
    else
    {
        System.out.println("Steel is Grade 5");
    }

}
}