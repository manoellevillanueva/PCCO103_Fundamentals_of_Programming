import java.util.Scanner;

public class QuizVillanueva {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("\nPlease enter the floor board length. \nLength: ");
       String boardLength = input.nextLine();
       System.out.print("\nPlease enter the floor board width. \nWidth: ");
       String boardWidth = input.nextLine();
       System.out.print("\nPlease enter the floor board thickness. \nThickness: ");
       String boardThickness = input.nextLine();

       System.out.println("\nThe floor board length is... " + boardLength);
       System.out.println("The floor board width is... " + boardWidth);
       System.out.println("The floor board thickness is... " + boardThickness);

   }
}