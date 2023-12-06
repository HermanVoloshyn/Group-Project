package GroupProject;

public class Task3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even
        //numbers. Develop a program which will identify/print the even numbers
        //only.

        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };

        for (int row=0; row< matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++) {
           if (matrix[row][col]%2==0)
               System.out.println(matrix[row][col]);
            }
        }

    }
}
