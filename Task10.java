package GroupProject;

public class Task10 {
    public static void main(String[] args) {
//Write a program to print out duplicate elements from an Array of Strings?
String [] str={"aba","bda","bcd","dav","cdc","bcd","cod","aba","duv"};

        for (int i=0; i<str.length-1; i++){
           for (int j=i+1; j<str.length; j++){
                if (str[i].equals(str[j])) {
                    System.out.println("Duplicate Element is "+str[j]);
                }
           }
        }
    }
}
