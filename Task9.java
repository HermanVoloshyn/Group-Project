package GroupProject;

public class Task9 {
    public static void main(String[] args) {
//Write a java program to find the second largest number in the array?
        int [] num = {13,6,8,46,56,35,23,76};
        int temp;
        for (int i=0; i<num.length; i++){
            for (int j=i+1; j<num.length; j++){

                if (num[i]>num[j]) {
                    temp =num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }System.out.print("Second largest number is "+num[num.length-2]);

    }}