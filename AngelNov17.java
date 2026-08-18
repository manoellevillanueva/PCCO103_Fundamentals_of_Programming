import java.util.*;

public class AngelNov17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter a number with three digits. \n(For example: 365) \nYour Answer: ");
        int chosen = input.nextInt();
        int[] theChosen = new int[3];
        theChosen[0] = chosen % 10;
        theChosen[1] = (chosen / 10) % 10;
        theChosen[2] = (chosen / 100) % 10;
        int[] sortedChosen = chosenSort(theChosen);
        System.out.print("\nThe sum of each digit of that number is: " + totalAns(chosen));
        System.out.print("\nThe arrangement of those digits is: " + theChosen[0] + ", " + theChosen[1] + ", " + theChosen[2]);

    }


    public static int totalAns(int chosenDigit) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        num1 = chosenDigit % 10;
        num2 = (chosenDigit / 10) % 10;
        num3 = (chosenDigit / 100) % 10;

        int sum = num1 + num2 + num3;
        return sum;
    }

    public static int[] chosenSort(int[] theChosen) {
        Arrays.sort(theChosen);
        int temp = theChosen[0];
        theChosen[0] = theChosen[2];
        theChosen[2] = temp;
        return theChosen;
    }
}