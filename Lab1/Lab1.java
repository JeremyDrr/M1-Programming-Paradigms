public class Lab1 {

    /*
     * Write the code to compute the following numeric expression
     */

    public static void main(String[] args) {

        //double result = (((1/2)+((3/17 * 5/2))+Math.sqrt(1/2)) / (2/Math.sqrt(7/3))  *  (((9/2) + (3/4))/(1/Math.pow(3,3))));

        double result = ((1D/2D)+((3D/17D)*(5D/2D))+(Math.sqrt(1D/2D)))/(2D/Math.pow(7,3)) * (((9D/2D)+(3D/4D)) /(1D/Math.pow(3,3)));

        System.out.println(result);

    }
}