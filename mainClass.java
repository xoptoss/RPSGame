package mainPackage;

import java.util.Scanner;

public class mainClass {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.out.println("Lets play rock paper scissors!");
        System.out.println("Enter your Choice.");
        
        game user = new game();
        randomNumber rng = new randomNumber();
      
        rng.GetANumber();
        user.getChoice();
       //rock=1 paper=2 scissors=3    
        if(user.choice == rng.cpuChoice)
        {
           System.out.println("Its a Tie!"); 
        }
        else if((user.choice ==1 && rng.cpuChoice == 3)
                ||(user.choice == 2 && rng.cpuChoice == 1)
                ||(user.choice == 3 && rng.cpuChoice == 2))
        {
            System.out.println("You Win!");           
        }
        else if((user.choice ==1 && rng.cpuChoice == 2)
                ||(user.choice == 2 && rng.cpuChoice == 3)
                ||(user.choice == 3 && rng.cpuChoice == 1))
        {
            System.out.println("You Lose!");
        }
        else
        {
            System.out.println("Try Agian!");
        }
      
    }
    
}
//Good job
