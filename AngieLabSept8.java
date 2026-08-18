import java.util.Scanner;

public class AngieLabSept8 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
      
       System.out.print("\n\nPlease enter your name. \nName: ");
       String yourName = input.nextLine();
       System.out.print("\n\nPlease enter your age. \nAge: ");
       int yourAge = input.nextInt();
       System.out.print("\n\nPlease enter your favorite hobby. \nHobby: ");
       String yourHobby = input.next();
       System.out.print("\n\nPlease enter your address. \nAddress: ");
       String yourAddress = input.next();
       System.out.print("\n\nPlease enter your grade point average. \nGrade Point Average: ");
       double yourGrade = input.nextDouble();

       System.out.println("Your name is... " + yourName);
       System.out.println("Your age is... " + yourAge + " years old");
       System.out.println("Your hobby is... " + yourHobby);
       System.out.println("Your address is... " + yourAddress);
       System.out.println("Your grade is... " + yourGrade);
   }
}


