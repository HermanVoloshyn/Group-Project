package GroupProject;

public class Task1 {
    public static void main(String[] args) {
//Create a program that uses an array to store a list of temperatures for a week,
//and then uses a loop to find the highest and lowest temperature for the week.

        int [] temp= {25,56,73,45,85,9,55};

        int high = temp[0];
        int low = temp[0];
        for (int i = 0; i < 7; i++) {

            if (high < temp[i]) {
                high = temp[i]; }

            if (low > temp[i]) {
                low = temp[i]; }

        }
        System.out.println("Highest temperature is "+high);
        System.out.println("Lowest temperature is "+low);
    }
}
