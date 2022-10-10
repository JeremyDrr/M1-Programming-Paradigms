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
        for(int i = 0; i<sentence.length(); i++){

            //Get the current character
            char curr= sentence.charAt(i);

            //Could've used an array. Though vowels are not something changing every year, so it's okay to be put "roughly"
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u' || curr == 'y')
                nbVows++;
            else
                nbCons++;

        }

        System.out.println(nbVows);
    }
}