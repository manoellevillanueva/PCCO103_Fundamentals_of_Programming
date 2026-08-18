import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class SeatworkVillanuevaOct20 {
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("\nPlease enter your Class Participation Grade: ");
    double classGrade = input.nextDouble(); 

  System.out.print("Please enter your Midterm Exam Grade: ");
    double examGrade = input.nextDouble();

    double minGrade = 3;
    double midtermGradeSol = (classGrade*0.6666666666666667)+(examGrade * 0.3333333333333333);

    DecimalFormat df1 = new DecimalFormat("#.000");
    double formattedValue1 = Double.valueOf(df1.format(classGrade));

    DecimalFormat df2 = new DecimalFormat("#.000");
    double formattedValue2 = Double.valueOf(df2.format(examGrade));

    DecimalFormat df3 = new DecimalFormat("#.000");
    double formattedValue3 = Double.valueOf(df3.format(midtermGradeSol));
 
  System.out.println("\nYour Class Participation Grade is: " + formattedValue1);
  System.out.println("Your Midterm Exam Grade is: " + formattedValue2);   
  System.out.println("\nYour Computed Midterm Grade is: " + formattedValue3);

    if (midtermGradeSol >= 1.00 && midtermGradeSol <= 1.125) {
       System.out.println("Your Transmuted Midterm Grade is 1.00");
    }
    
       else if (midtermGradeSol >= 1.126 && midtermGradeSol <= 1.375) {
         System.out.println("Your Transmuted Midterm Grade is 1.25"); 
       }
       else if (midtermGradeSol >= 1.376 && midtermGradeSol <= 1.625) {
         System.out.println("Your Transmuted Midterm Grade is 1.50");
       }
       else if (midtermGradeSol >= 1.626 && midtermGradeSol <= 1.875) {
         System.out.println("Your Transmuted Midterm Grade is 1.75");
       }
       else if (midtermGradeSol >= 1.876 && midtermGradeSol <= 2.125) {
         System.out.println("Your Transmuted Midterm Grade is 2.00");
       }
       else if (midtermGradeSol >= 2.126 && midtermGradeSol <= 2.375) {
         System.out.println("Your Transmuted Midterm Grade is 2.25");
       }
       else if (midtermGradeSol >= 2.376 && midtermGradeSol <= 2.625) {
         System.out.println("Your Transmuted Midterm Grade is 2.50");
       }
       else if (midtermGradeSol >= 2.626 && midtermGradeSol <= 2.875) {
         System.out.println("Your Transmuted Midterm Grade is 2.75");
       }
       else if (midtermGradeSol >= 2.876 && midtermGradeSol <= 3.255) {
         System.out.println("Your Transmuted Midterm Grade is 3.00");
       }
       else if (midtermGradeSol >= 3.256 && midtermGradeSol <= 3.755) {
         System.out.println("Your Transmuted Midterm Grade is 4.00");
       }
       else if (midtermGradeSol >= 3.756){
         System.out.println("Your Transmuted Midterm Grade is 5.00");
       }

  if (minGrade >= midtermGradeSol) {
    System.out.println("\nYou have PASSED!");
    System.out.println("Congratulatons, keep it up!");
  }
    else {
       System.out.println("\nYou have FAILED!");
       System.out.println("Don't give up, you can do it!");
    }

}
} 
