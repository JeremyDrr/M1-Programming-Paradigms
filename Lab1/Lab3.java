import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab3 {

    /*
     * Read a sentence from the keyboard.
     * Compute number of vowels and number of consonants.
     */

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        //Print to enter a sentence and read the input
        System.out.println("Type a sentence");
        String sentence = scan.nextLine();

        //Declaration and initialisation of the variables
        int nbCons = 0, nbVows = 0;

        //Check number of characters in the sentence
        for(int i = 0; i < sentence.length(); i++) {

            //Working with a String instead of char, so we put the sentence on lower case to ignore the caps.
            // We would have to add the uppercase letters to the condition if we would work with chars
            String curr = String.valueOf(sentence.charAt(i)).toLowerCase();

            //Could've used an array.
            if (curr.equals("a") || curr.equals("e") || curr.equals("i") || curr.equals("o") || curr.equals("u") || curr.equals("y"))
                nbVows++;
            else
                nbCons++;
        }
        System.out.println("Number of vowels: \t\t" + nbVows);
        System.out.println("Number of consonants: \t" + nbCons);
    }
}