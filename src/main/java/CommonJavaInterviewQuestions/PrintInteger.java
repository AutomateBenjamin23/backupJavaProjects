package CommonJavaInterviewQuestions;
import java.io.Reader;
import java.util.Scanner;

public class PrintInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLEASE ENTER A NUMBER: " );

        int num = scan.nextInt();
        System.out.println("you entered: "+ num);
    }
}
