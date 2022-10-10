import java.util.Arrays;
import java.util.Random;

public class Lab4 {

    /*
     * Create a bi-dimensional array with dimensions 5 and 6 (5 X 6).
     * Fill it with random integer numbers between 0 and 100.
     * Display it.
     * Compute and display the sum of elements on each row and column.
     */

    public static void main(String[] args) {

        //Declaration and initialisation of the multidimensional array
        int[][] intArray = new int[5][6];
        int sum = 0;

        Random r = new Random();

        //Fill the array with random integer on a [0;100] range
        for(int i = 0; i < intArray.length; i++) {

            sum = 0;

            for (int j = 0; j < intArray[i].length; j++) {

                int random = r.nextInt(0, 100);

                //Assign the random number to the slot
                intArray[i][j] = random;
                System.out.print(intArray[i][j] + "\t");
                sum += intArray[i][j];
            }

            System.out.println("| SUM: " + sum);
        }

        System.out.println("-------------------------");

        //Calculate the columns sum
        //C++, got it? ;)
        for(int c = 0; c < intArray[0].length; c++){

            sum = 0;

            for(int x = 0; x < intArray.length; x++){
                sum += intArray[x][c];

            }

            System.out.print(sum + "\t");
        }
    }
}