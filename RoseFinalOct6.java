// Scanner
import java.util.Scanner;

public class RoseFinalOct6 {
public static void main(String[] args) {

// Scanner
Scanner input = new Scanner(System.in);

  // Print
  System.out.println(" ");
  System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
  System.out.println(" ");
  System.out.println("Welcome to a program about my Patron Saint: St. Rose of Lima!");
  System.out.println("You must answer the questions in order to know her full name, her birthday, and even get to know a fun fact about her!");
  System.out.println(" ");

  // User Input
  System.out.println("What is your name?");
  System.out.print("Name: ");
  String name = input.nextLine();
  System.out.println(" ");
  System.out.println("Welcome to the game, " + name + "! I hope you enjoy it!");
  System.out.println(" ");
  System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
  System.out.println(" ");

  // Arithmetic Operations
  System.out.println("What is 41°F in °C?");
  System.out.print("Your Answer: ");
  int answ1 = input.nextInt();
  // The answer is 5
  int answ1Sol = ((5*(41-32))/9);

    // If statements
    if (answ1 == answ1Sol) {
       // For "IF" statements: code to be executed if "condition" is true
       System.out.println("Correct!");
       System.out.println(" ");
       System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
       System.out.println(" ");
       System.out.println("The full name of St. Rose of Lima is Isabel Flores de Oliva.");
       System.out.println(" ");      
       System.out.println("Would you like to continue and know her birthday too?");
       System.out.println("[Type '1' if YES]   [Type '2' if NO]");
       System.out.print("Your Answer: ");
       int chose1 = input.nextInt();
       int chose1Yes = 1;
       int chose1No = 2;

         // Nested If statements
         if (chose1 == chose1Yes) { 
           // For "NESTED IF" statements: code to be executed if "condition" is true AND "subcondition" is also true
           System.out.println(" ");
           System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
           System.out.println(" ");
    
           // Arithmetic Operations
           System.out.println("Using the PEMDAS rule, find the answer to this equation: 11 + 27 - 9 * 8 / 2 = ?");
           System.out.println("[Type '1' if 1]  [Type '2' if 2]  [Type '3' if 3]  [Type '4' if 4]");
           System.out.print("Your Answer: ");
           int answ2 = input.nextInt();
           // The answer is 2
           int answ2Sol = 11+27-9*8/2;

             // Switch statements
             switch (answ2) {

             case 1:
               // For "SWITCH" statements: code to be executed if theValue is equal to 1
               System.out.println(" ");
               System.out.println("Wrong!");
               System.out.println("Keep trying, your answer is close!");
               System.out.println(" ");
             break;

             case 2:
               // For "SWITCH" statements: code to be executed if theValue is equal to 2
               System.out.println("Correct!");
               System.out.println(" ");
               System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
               System.out.println(" ");
               System.out.println("St. Rose of Lima was born on the 20th of April 1586, in Lima, Peru.");

               // If Else statements
               System.out.println(" ");
               System.out.println("Would you like to know a fun fact about St. Rose of Lima?");
               System.out.println("[Type '1' if YES]   [Type '2' if NO]");
               System.out.print("Your Answer: ");
               int chose2 = input.nextInt();
               int chose2Yes = 1;
               int chose2No = 2;
               
                 // If Else statements 
                 if (chose2 == chose2No){
                   System.out.println(" ");
                   System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
                   System.out.println(" ");
                   System.out.println("Thank you for playing! God bless you!");
                 }

                 // If Else statements
                 else if (chose2 == chose2Yes){
                   System.out.println(" ");
                   System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
                   System.out.println(" ");
                   System.out.println("Which Catholic religious order is St. Rose of Lima a part of?");
                   System.out.println("[Type '1' if BENEDICTINE]  [Type '2' if CARMELITE]  [Type '3' if DOMINICAN]  [Type '4' if FRANCISCAN]  [Type '5' if JESUIT]");
                   System.out.print("Your Answer: ");
                   int answ3 = input.nextInt();
                   // The answer is 3 (Dominican)
                   int benedictine = 1;
                   int carmelite = 2;
                   int dominican = 3;
                   int franciscan = 4;
                   int jesuit = 5;
                   
                     // If Else If statements        
                     if (answ3 == benedictine){
                       System.out.println(" ");
                       System.out.println("Incorrect, try again!");                       
                       System.out.println("St. Bernard of Clairvaux and St. Hildegard of Bingen are Benedictine Saints.");
                       System.out.println(" ");
                     }
          
                     // If Else If statements   
                     else if (answ3 == carmelite){
                       System.out.println(" ");
                       System.out.println("Incorrect, try again!");            
                       System.out.println("St. John of the Cross and St. Therese of Lisieux are Carmelite Saints.");
                       System.out.println(" ");
                     }
                  
                     // If Else If statements   
                     else if (answ3 == dominican){
                       System.out.println(" ");
                       System.out.println("Correct!");            
                       System.out.println("St. Thomas Aquinas and St. Rose of Lima are Dominican Saints.");
                       System.out.println(" ");
                       System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
                       System.out.println(" ");
                       System.out.println("Fun fact: St. Rose of Lima is the first canonized Catholic Saint who was born in the Americas.");
                       System.out.println(" ");
                       System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
                       System.out.println(" ");
                       System.out.println("Congratulations, you have completed the game!");
                       System.out.println("Thank you for playing, God bless you always!");
                     }

                     // If Else If statements     
                     else if (answ3 == franciscan){
                       System.out.println(" ");
                       System.out.println("Incorrect, try again!");            
                       System.out.println("St. Joseph of Cupertino and St. Clare of Assisi are Franciscan Saints.");
                       System.out.println(" ");
                     }

                     // If Else If statements     
                     else if (answ3 == jesuit){
                       System.out.println(" ");
                       System.out.println("Incorrect, try again!");            
                       System.out.println("St. Ignatius of Loyola and St. Francis Xavier are Jesuit Saints.");
                       System.out.println(" ");
                     }

                     // Else statements    
                     else{
                       System.out.println(" ");
                       System.out.println("Incorrect, try again!");
                       System.out.println("Please type the values '1', '2,' '3', '4', or '5' only! Thank you!");
                       System.out.println(" ");
                     }    
                 }
             break;

             case 3:
               // For "SWITCH" statements: code to be executed if theValue is equal to 3
               System.out.println(" ");
               System.out.println("Wrong!");
               System.out.println("Don't give up! I believe in you!");
               System.out.println(" ");
             break;

             case 4:
               // For "SWITCH" statements: code to be executed if theValue is equal to 4
               System.out.println(" ");
               System.out.println("Wrong!");
               System.out.println("Solve again! You can do it!");
               System.out.println(" ");
             break;

             default:
               // For "SWITCH" statements: code to be executed if theValue is not equal to any of the checked values
               System.out.println(" ");
               System.out.println("Wrong!");
               System.out.println("Please type the values '1', '2,' '3', or '4' only! Thank you!");
               System.out.println(" ");
             }
         }
       
         // Nested If statements
         if (chose1 == chose1No) {
           // For "NESTED IF" statements: code to be executed if "condition" is true AND "subcondition" is also true
           System.out.println(" ");
           System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
           System.out.println(" ");
           System.out.println("Thank you for playing! God bless you!");
         }

           // For "NESTED IF" statements: code here would still be executed as long as "condition" is true even if "subcondition" is false
           System.out.println("Saint Rose of Lima, pray for us!");

    // Else statements
    } else {
    // For "ELSE" statements: code to be executed if "condition" is false
       System.out.println(" ");
       System.out.println("Wrong answer, please try again!");
       System.out.println("God bless you!");
    }

}
}
