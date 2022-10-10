import java.util.Scanner;

public class Lab2 {
    public static void main(String args[]){

        /*
         * We use the Scanner class to read from keyboard
         */

        //Declaration of the scan variable.
        Scanner scan = new Scanner(System.in);

        //To avoid repeating stuff. A function returning a string would have been perfect as well.
        //To see more of this more flexible alternative, code is available in the class "Lab2_alt"

        System.out.println("Enter your first name");
        String fName = scan.nextLine();

        System.out.println("Enter your last name");
        String lName = scan.nextLine();

        System.out.println("Enter your CNP");
        String cnp = scan.nextLine();


        //Parse information to generate a password
        String pass = fName.substring(0,2).toLowerCase() + lName.substring(lName.length()-2).toUpperCase();

        //Display the password in the console
        System.out.println("Hello " + fName + " " + lName + "! Your password is: " + pass);

    }
}