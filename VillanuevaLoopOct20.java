import java.util.Scanner;

public class VillanuevaLoopOct20 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("\nPlease enter your name: ");
  String name = input.nextLine();

  int count1 = 1;
  while (count1 <= 5){
    System.out.print(name + " ");
    count1++;
  }

System.out.print("\n\nPlease enter an integer: ");
  int num1 = input.nextInt();

System.out.print("Please enter a different integer: ");
  int num2 = input.nextInt();

  if (num1 == num2){
    System.out.print("Try again! Please enter two different integers only!");
  }

  else {
    System.out.println("\nHow many times would you like to print the highest integer you have chosen?");
    System.out.print("Your answer: ");
       int num3 = input.nextInt();

    if (num1 == num2){
       System.out.println("Try again! Please enter two different integers only!");
    }

    else if (num1 > num2){
       int count2 = 1;
       while (count2 <= num3){
         System.out.print(num1 + " ");
         count2++;
       }
    }

    else if (num2 > num1){
       int count3 = 1;
       while (count3 <= num3){
         System.out.print(num2 + " ");
         count3++;
       }
    }



  }

  System.out.println(" ");

}
}

