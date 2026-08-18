import java.util.Scanner;

public class Rose {
public static void main(String[] args) {

// Scanner
Scanner input = new Scanner(System.in);

  // System.out.print
  System.out.println(" ");
  System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
  System.out.println(" ");
  System.out.println("Welcome to a program about my Patron Saint: St. Rose of Lima!");
  System.out.println("You must solve the math problems in order to know her full real name and her birthday.");
  System.out.println(" ");
  System.out.println("What is your name?");
  System.out.print("Name: ");
  String name = input.nextLine();
  System.out.println(" ");
  System.out.println("Welcome to the game, " + name + "! I hope you enjoy it!");
  System.out.println(" ");
  System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
  System.out.println(" ");

  // Arithmetical (Computation)
  System.out.println("What is 41°F in °C?");
  System.out.print("Your Answer: ");
  int answ1 = input.nextInt();
  int answ1Sol = ((5*(41-32))/9);

    // If statements
    if (answ1 == answ1Sol) {
       // For "if" statements: code to be executed if "condition" is true
       System.out.println("Correct!");
       System.out.println(" ");
       System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
       System.out.println(" ");
       System.out.println("Her full name was Isabel Flores de Oliva.");
       System.out.println(" ");      
       System.out.println("Would you like to continue and know her birthday too?");
       System.out.println("[Type '1' if YES]   [Type '2' if NO]");
       System.out.print("Your Answer: ");
       int chose1 = input.nextInt();
       int chose1Yes = 1;
       int chose1No = 2;

         // Nested If statements
         if (chose1 == chose1Yes) { 
           // For "nested if" statements: code to be executed if "condition" is true AND "subcondition" is also true
           System.out.println(" ");
           System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
           System.out.println(" ");
           System.out.println("To get her birthday, answer this!");
           System.out.println(" ");
           System.out.println("What should be the operation used in the blank space, in order to make the equation true?");
           System.out.println("18 / 3 ___ 7 + 2 * 5 = 5");
           System.out.println(" ");
           System.out.println("The choices are...  [Type '1' if ADDITION]  [Type '2' if SUBTRACTION]  [Type '3' if MULTIPLICATION]  [Type '4' if DIVISION]");
           System.out.print("Your Answer: ");
           int answ2 = input.nextInt();
           int answ2Sol = 2;

             // Switch statements
             switch (answ2) {

             case 1:
               // For "Switch" statements: code to be executed if theValue is equal to 1
               System.out.println(" ");
               System.out.println("Wrong!");
               System.out.println("Keep trying, your answer is close!");
             break;

             case 2:
               // For "Switch" statements: code to be executed if theValue is equal to 2
               System.out.println("Correct!");
               System.out.println(" ");
               System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
               System.out.println(" ");
               System.out.println("St. Rose of Lima was born on April 20, 1586, in Lima, Peru.");
             break;

             case 3:
               // For "Switch" statements: code to be executed if theValue is equal to 3
               System.out.println(" ");
               System.out.println("Wrong!");
               System.out.println("You have to use a much different operation!");
             break;

             case 4:
               // For "Switch" statements: code to be executed if theValue is equal to 4
               System.out.println(" ");
               System.out.println("Wrong!");
               System.out.println("Solve again! You can do it!");
             break;

             default:
               // For "Switch" statements: code to be executed if theValue is not equal to any of the checked values
               System.out.println(" ");
               System.out.println("Wrong!");
               System.out.println("Please type the values '1', '2,' '3', or '4' only! Thank you!");
             }
         }

         if (chose1 == chose1No) {
           // For "nested if" statements: code to be executed if "condition" is true AND "subcondition" is also true
           System.out.println(" ");
           System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
           System.out.println(" ");
           System.out.println("Thank you for playing! God bless you!");
         }
       
           // For "nested if" statements: code here would still be executed as long as "condition" is true even if "subcondition" is false
           System.out.println("Saint Rose of Lima, pray for us!");
       
    // Else statements
    } else {
    // For "else" statements: code to be executed if "condition" is false
       System.out.println("Wrong answer, please try again!");
    }

}
}
