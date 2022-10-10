import java.util.Scanner;

public class Lab2_alt {

    /*
     * We use the Scanner class to read from keyboard
     */

    public static void main(String args[]){

        //Call the function. Just specifying what input is required
        String fName = input("Enter your first name");
        String lName = input("Enter your last name");
        String cnp = input("Enter your CNP");

        //Parse information to generate a password
        String pass = fName.substring(0,2).toLowerCase() + lName.substring(lName.length()-2).toUpperCase();

        //Display the password in the console
        System.out.println("Hello " + fName + " " + lName + "! Your password is: " + pass);

    }

    //Definition of the function.
    //Easier in case of changing the logic. We only have to change it once.
    private static String input(String requiredText){

        Scanner scan = new Scanner(System.in);

        //Print the text parsed by parameter
        System.out.println(requiredText);

        //Read the entered field
        String field = scan.nextLine();

        //Returning it as a String
        return field;
    }
}