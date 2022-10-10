import java.util.Random;

public class Lab5 {

    /*
     * Fill an array of 100 int with random numbers from 0 to 100.
     * Compute
     * - Length of the longest succession of even numbers
     * - The Greatest difference between two successive numbers
     */

    public static void main(String[] args) {

        //Declaration and initialisation of the variables
        int[] myArray = new int[100];
        Random r = new Random();
        int longestSuccession = 0;
        boolean isEven = false;
        int maxDif = 0;
        int lastLoop = 0;

        for(int i = 0; i <myArray.length; i++){

            //Temp variable to do calculations
            int dif = 0;

            //Fill the array with random numbers between 0 & 100
            int randomNb = r.nextInt(0,100);
            myArray[i] = randomNb;

            //Check the difference with the previous number
            if(lastLoop < myArray[i]){
                dif = myArray[i] - lastLoop;
            }else{
                dif = lastLoop - myArray[i];
            }

            //If the difference is greater than the last recorded difference, we overwrite it
            if(dif > maxDif)
                maxDif = dif;
            //Debug message, to show how I obtained my result
            System.out.println("Dif: " + dif + " | Obtained by " + lastLoop + "-" + myArray[i] + " | Current: " + myArray[i] + " | Biggest: " + maxDif);

            //Check if number is even
            if(myArray[i] % 2 == 0){
                //If the last number was also an even number --> We increment the counter
                if(isEven){
                    longestSuccession += 1;
                }else{
                    //Otherwise, we say that we encountered an even number and reset the counter
                    isEven = true;
                    longestSuccession = 0;
                    longestSuccession += 1;
                }
            }else{
                //If the current number is odd. We put the boolean at "false"
                isEven = false;
            }

            //Lastloop is used to detect the greatest difference between two successive numbers
            lastLoop = myArray[i];
        }


        //Result messages
        System.out.println("Length of the longest succession of even numbers: \t\t" + longestSuccession);
        System.out.println("Greatest difference between two successive numbers: \t" + maxDif);
    }
}
