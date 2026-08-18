import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class VillanuevaNov10final {
    public static void main(String[] args) {

        System.out.print(
                "\nWould you like to make a new record or view an old record? \n[Type 'new' to MAKE A NEW RECORD]   [Type 'quit' to VIEW AN OLD RECORD]   [Type 'stop' to EXIT THE PROGRAM] \nYour Answer: ");

        while (true) {
            HashMap<String, HashMap<String, String>> database = new HashMap<>();
            Scanner input = new Scanner(System.in);

            String userNew = "new";
            String userQuit = "quit";
            String userStop = "stop";
            String userAns = input.nextLine();

            if (userAns.equalsIgnoreCase(userNew)) {

                System.out.print("\nPlease enter your name... ");
                String yourName = input.nextLine();

                System.out.print("Please enter your age... ");
                int yourAge = input.nextInt();
                String yourAge_As_String = Integer.toString(yourAge);

                System.out.print("Please enter your gender... ");
                String yourGender = input.nextLine();
                yourGender = input.nextLine();

                System.out.print("Please enter your course... ");
                String yourCourse = input.nextLine();

                System.out.print("Please enter your year enrolled... ");
                int yourYear = input.nextInt();
                String yourYear_As_String = Integer.toString(yourYear);

                for (int i = 0; i < 1; i++) {
                    Random rand = new Random();
                    int lowerbound = 99;
                    int upperbound = 1000;
                    int int_random = rand.nextInt(upperbound);
                    Date dNow = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat(yourYear + "-" + "ss" + int_random);
                    String yourNumber = ft.format(dNow);

                    HashMap<String, String> stu = new HashMap<>();
                    stu.put("Full Name ", yourName);
                    stu.put("Age ", yourAge_As_String);
                    stu.put("Gender ", yourGender);
                    stu.put("Course ", yourCourse);
                    stu.put("Year Enrolled ", yourYear_As_String);
                    stu.put("ID Number ", yourNumber);
                    System.out.println(stu);
                    database.put(yourNumber, stu);

                    System.out.print(
                            "\nYour new record is saved! \nWould you like to make a new record or view an old record? \n[Type 'new' to MAKE A NEW RECORD]   [Type 'quit' to VIEW AN OLD RECORD]   [Type 'stop' to EXIT THE PROGRAM] \nYour Answer: ");

                } // for (int i = 0; i < 1; i)

            } // if (userAns.equalsIgnoreCase(userNew))

            else if (userAns.equalsIgnoreCase(userQuit)) {
                System.out.print("\nPlease enter an ID number: ");
                String chosenNum = input.nextLine();

                if (database.containsKey(chosenNum)) {
                    HashMap<String, String> stu = database.get(chosenNum);
                    System.out.println("Name: " + stu.get("Full Name "));
                    System.out.println("Age: " + stu.get("Age "));
                    System.out.println("Gender: " + stu.get("Gender "));
                    System.out.println("Course: " + stu.get("Course "));
                    System.out.println("Year Enrolled: " + stu.get("Year Enrolled "));
                    System.out.println("ID Number: " + stu.get("ID Number "));
                } else {
                    System.out.println("No record found for ID: " + chosenNum);
                }

                System.out.print(
                        "\nYour old record is found! \nWould you like to make a new record or view an old record? \n[Type 'new' to MAKE A NEW RECORD]   [Type 'quit' to VIEW AN OLD RECORD]   [Type 'stop' to EXIT THE PROGRAM] \nYour Answer: ");

            } // else if (userAns.equalsIgnoreCase(userQuit))

            else if (userAns.equalsIgnoreCase(userStop)) {
                break;
            } // if (userAns.equalsIgnoreCase(userStop))

        } // while(true)

    } // public static void main(String[] args)
} // public class VillanuevaNov10
