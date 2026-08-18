import java.util.Scanner;

public class Angie {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\r\rPlease enter your name... ");
        String yourName = input.nextLine();
        System.out.print("\r\rPlease enter your age... (number only, please!) ");
        String yourAge = input.nextLine();
        System.out.print("\r\rPlease enter your favorite hobby... ");
        String yourHobby = input.nextLine();
        System.out.print("\r\rPlease enter your address... ");
        String yourAddress = input.nextLine();
        System.out.print("\r\rPlease enter your grade point average... (whole number only, please!) ");
        double yourGrade = input.nextDouble();

        System.out.println("\rYour name is... " + yourName);
        System.out.println("Your age is... " + yourAge + " years old");
        System.out.println("Your hobby is... " + yourHobby);
        System.out.println("Your address is... " + yourAddress);
        System.out.println("Your grade point average is... " + yourGrade);
    }
}