import java.util.Scanner;

public class VillanuevaLabSept8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter your name... ");
        String yourName = input.nextLine();
        System.out.print("Please enter your age... ");
        String yourAge = input.nextLine();
        System.out.print("Please enter your favorite hobby... ");
        String yourHobby = input.nextLine();
        System.out.print("Please enter your address... ");
        String yourAddress = input.nextLine();
        System.out.print("Please enter your grade point average... ");
        double yourGrade = input.nextDouble();

        System.out.println("\nYour name is... " + yourName);
        System.out.println("Your age is... " + yourAge + " years old");
        System.out.println("Your hobby is... " + yourHobby);
        System.out.println("Your address is... " + yourAddress);
        System.out.println("Your grade point average is... " + yourGrade);
    }
}