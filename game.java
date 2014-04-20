package mainPackage;

import java.util.Scanner;

public class game {
    
    private String input;
    public int choice;
    
    public void getChoice()
    {
        Scanner tKeyboard = new Scanner(System.in);
        input = tKeyboard.nextLine();
        {
            switch(input.toLowerCase()) 
            {
                case "rock":
                    choice = 1;
                    break;
                case "paper":              
                    choice = 2;  
                    break;
                case "scissors":              
                    choice = 3;     
                    break;
                default:
                    System.out.println("That's not a choice!");
            }
            return;
            
        }
    }    
}

