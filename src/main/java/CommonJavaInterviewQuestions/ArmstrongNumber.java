package CommonJavaInterviewQuestions;

public class ArmstrongNumber { // also an "Narcissistic Number"
    public static void main(String[] args) {
        // 153 ==> 1*1*1+5*5*5+3*3*3 = 153
        int num = 153;                          //create 3 variables
        int actualNum = num;
        double result = 0;

        while (actualNum != 0){                 //while loop
            int n = actualNum % 10;
            result = result + Math.pow(n,3);

            actualNum = actualNum/10;

        }
        if (result == num){                         //if/else statement
            System.out.println(num + " is an Armstrong number");
        }else {
            System.out.println(num + " is not an Armstrong number");
        }

    }
}
