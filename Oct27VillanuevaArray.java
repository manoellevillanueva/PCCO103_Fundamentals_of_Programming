import java.util.Scanner;
  public class Oct27VillanuevaArray {
  public static void main(String args[]){
  Scanner input = new Scanner(System.in);
    
  System.out.print("\nThe number you want for the array range: ");
    int user = input.nextInt();
  
  System.out.print("\n");

  int[] range = new int[user];

    for (int ct=0; ct<user; ct++) {
       System.out.print("Enter a number: ");
       range[ct] = input.nextInt();
    }

  double sum = 0;
    for (int ct=0; ct<user; ct++) {
    sum += range[ct];
    }

  double average = sum/user;

  System.out.print("\nYou entered the numbers: ");
    for (int ct=0; ct<user; ct++) {
       if (ct > 0) {
         System.out.print(", ");
       }
    System.out.print(range[ct]);
    }

  System.out.println("\nThe average of these numbers is: " + average);

}
}