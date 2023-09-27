package CommonJavaInterviewQuestions;

import java.sql.SQLOutput;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //without temp var:
        System.out.println("before swapping:");
        System.out.println("a " +a);
        System.out.println("b " +b);

        System.out.println("after swapping:");

        a = a+b; //30
        b = a-b; //10
        a = b-a; //20

        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }

}
