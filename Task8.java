package GroupProject;

public class Task8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
int [] num = {13,56,68,88,2,78,43,85,96};
int max =num[0];
int min = num[0];

for (int i=0; i<num.length; i++){
    if (max<num[i]) {
        max=num[i];
    }
    if (min > num[i]) {
        min = num[i];
    }
}
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);
    }
}
