import java.util.*;
import java.io.IOException;

public class finalsVillanueva {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("\nProgram by Maria Angel Noelle Villanueva BSCS1A");
System.out.println("~ ~ ~ Converting Weights ~ ~ ~");

System.out.print("\nType 1 or 2 for what you would like to do... \n[1] Convert from Pounds to Kilograms \n[2] Convert from Kilograms to Pounds \nYour Answer: ");
int ans = input.nextInt();

if (ans == 1) {
System.out.println("\n~ ~ ~ Convert from Pounds to Kilograms ~ ~ ~");
System.out.print("Enter weight in pounds... ");
double pound = input.nextDouble();

System.out.println("Weight in Pounds: " + pound);
System.out.println("Converted to Kilograms: " + poundToKilogram(pound));
} 

else if (ans == 2) {
System.out.println("\n~ ~ ~ Convert from Kilograms to Pounds ~ ~ ~");
System.out.print("Enter weight in kilograms... ");
double kilogram = input.nextDouble();

System.out.println("Weight in Kilograms: " + kilogram);
System.out.println("Converted to Pounds: " + kilogramToPound(kilogram));
}

}

public static double kilogramToPound(double kilogram) {
double pound = 0;
pound = (2.204 * kilogram);
return pound; 
}

public static double poundToKilogram(double pound) {
double kilogram = 0;
kilogram = 0.453 * pound;
return kilogram;
}

}
