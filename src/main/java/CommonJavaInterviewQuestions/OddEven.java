package CommonJavaInterviewQuestions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("plz enter a number: ");

        int numb = reader.nextInt();

        if (numb % 2 == 0){
            System.out.println(numb + "is even");
        }else{
            System.out.println(numb + " is odd");
        }

    }
}
