package CommonJavaInterviewQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Fibonacci 0 1 1 2 3 5 8 13 21 34

        int num = 10;                       // 3 variables
        int t1 = 0;
        int t2 = 1;

        for (int i = 1; i<=num; i++){       //for loop
            System.out.println(t1);

            int sum = t1 + t2;              //Swap
            t1 = t2;
            t2 = sum;
        }



    }


}
