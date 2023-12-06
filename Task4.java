package GroupProject;

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will calculate the
        //sum of even and odd numbers for that array.

        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };
        int even=0;
        int odd=0;

        for (int row=0; row< matrix.length; row++){
            for (int col=0; col<matrix[row].length; col++) {
                if (matrix[row][col]%2==0) {
            even=even+matrix[row][col];
            }
            else if (matrix[row][col]%2!=0) {
                odd =odd+matrix[row][col];
                }
        }

    }
        System.out.println("sum of even numbers is "+even);
        System.out.println("sum of odd numbers is "+odd);

    }}
