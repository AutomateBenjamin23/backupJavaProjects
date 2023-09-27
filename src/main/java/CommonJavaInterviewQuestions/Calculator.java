package CommonJavaInterviewQuestions;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        double first = scan.nextDouble();
        double second = scan.nextDouble();

        System.out.println("Please enter an operator: (+,-,*,/): ");
        char operator = scan.next().charAt(0);

        double result = 0;
        switch (operator){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '8':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("Please pass the correct operator ");
                break;
        }
            System.out.println(result);

    }
}
