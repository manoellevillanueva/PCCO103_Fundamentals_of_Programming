import java.util.Scanner;
public class VillanuevaOct20 {
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("\nPlease enter your Class Participation Grade: ");
    double classGrade = input.nextDouble(); 

  System.out.print("\nPlease enter your Midterm Exam Grade: ");
    double examGrade = input.nextDouble();

    double midtermGrade = 3;
    double midtermGradeSol = (classGrade*0.6666666666666667)+(examGrade * 0.3333333333333333);

    if (midtermGradeSol >= 1.00 && midtermGradeSol <= 1.25){
       System.out.println("\nYour Midterm Grade is 1.00");
    }
    
    else if (midtermGradeSol >= 1.126 && midtermGradeSol <= 1.375){
       System.out.println("\nYour Midterm Grade is 1.25");
    }

    else if (midtermGradeSol >= 1.376 && midtermGradeSol <= 1.625){
       System.out.println("\nYour Midterm Grade is 1.50");
    }

    else if (midtermGradeSol >= 1.626 && midtermGradeSol <= 1.875){
       System.out.println("\nYour Midterm Grade is 1.75");
    }

    else if (midtermGradeSol >= 1.876 && midtermGradeSol <= 2.125){
       System.out.println("\nYour Midterm Grade is 2.00");
    }

    else if (midtermGradeSol >= 2.126 && midtermGradeSol <= 2.375){
       System.out.println("\nYour Midterm Grade is 2.25");
    }

    else if (midtermGradeSol >= 2.376 && midtermGradeSol <= 2.625){
       System.out.println("\nYour Midterm Grade is 2.50");
    }

    else if (midtermGradeSol >= 2.626 && midtermGradeSol <= 2.875){
       System.out.println("\nYour Midterm Grade is 2.75");
    }

    else if (midtermGradeSol >= 2.876 && midtermGradeSol <= 3.255){
       System.out.println("\nYour Midterm Grade is 3.00");
    }

    else if (midtermGradeSol >= 3.256 && midtermGradeSol <= 3.755){
       System.out.println("\nYour Midterm Grade is 4.00");
    }

    else if (midtermGradeSol >= 3.756){
       System.out.println("\nYour Midterm Grade is 5.00");
    }

  if (midtermGrade >= midtermGradeSol) {
    System.out.print("Congratulations, you have PASSED!");
  }

  else {
    System.out.println("You have FAILED, but don't give up!");
  }

}
} 
