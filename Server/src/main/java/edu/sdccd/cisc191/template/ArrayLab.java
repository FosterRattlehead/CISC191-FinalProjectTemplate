package edu.sdccd.cisc191.template;



/**
 * CISC191 2.3 Multidimensional Arrays - Junior
 * @author Emad Shiran
 */


public class ArrayLab {
    /**
     * @param args command line parameters
     */
    public static void main(String[] args) {
        int[][] spreadsheet = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9} };
        System.out.println("Max: " + max(spreadsheet));
        System.out.println("Sum of row 0: " + rowSum(spreadsheet,0));
        System.out.println("Sum of col 0: " + columnSum(spreadsheet,0));
        int[] rowSums = allRowSums(spreadsheet);
        for(int row = 0; row < rowSums.length; row++) {
            System.out.println("Sum of row " + row + ": " + rowSums[row]);
        }

    }

    /**
     * @param a 2D array
     * @return the maximum value in the 2d parameter array a
     */
    public static int max(int[][] a) {
        // setting aa tem value as the first number so we can compare them
        int tempMax=a[0][0];

        // a loop to go through all of the rows and coloms
        for (int i=0; i<a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                // here we have a condtion that changes the temp value
                if (a[i][j]>tempMax) {
                    // as we go through if the system fides a number that bigger then what it currently has it replacess it
                    tempMax=a[i][j];

                }



            }
        }
        return tempMax;
    }

    /**
     * @param a 2D array
     * @param x row index
     * @return the sum of the elements in Row x of a
     */
    public static int rowSum(int[][] a, int x) {

        // same as the last part a code that we store a value in
        int tempAdd=0;



        //Here we go through the rows and colomns and add the values of the rows that we want
            for (int j = 0; j < a[x].length; j++) {
                tempAdd+=a[x][j];


        }
        return tempAdd;
    }

    /**
     * @param a 2D array
     * @param x column index
     * @return the sum of the elements in Column x of a (careful with rows of different lengths!)
     */
    public static int columnSum(int[][] a, int x) {
        // yet again we have a temp value
        int tempAdd=0;
        //here insted of coloms we go to rows
        for (int i=0; i<a.length; i++) {

            // here we are doing a bit of exception handing but with if's
            // we say if the elemts are in range runt the code
            /* if (x<a[i].length) {

                // add the values of the column
                tempAdd+=a[i][x];



            }
            */
            //here we are doing exception handling but with blocks
            //here it will run the code
            try  {
                tempAdd+=a[i][x];
            }
            // if it runs into a problem use the array out of bounds exception
            catch (ArrayIndexOutOfBoundsException errorToCatch) {

            }

        }
        return tempAdd;
    }

    /**
     * @param a 2D array
     * @return calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
     */
   // thanks to Scott Billitti for helping me on this one
    public static int[] allRowSums(int[][] a) {
        //here we make a new array and we set it as the length of a
        int [] ansArray= new int [a.length];

        // here we do a for loop to go through the rows and collomns
        for (int i=0; i<a.length; i++) {
            // here we set a temp value but we do it here since we are looping we want to set the value to 0 each time
            int tempSum=0;

            for (int j=0; j<a[i].length; j++) {
                //here we add the values  and put them in a temp value
                tempSum+=a[i][j];

            }
            //finally im my favriot part as we i goes up the elemnt changes and we store the values of those numbers to each elemnt
        ansArray[i]=tempSum;

        }


        return ansArray;
    }


}