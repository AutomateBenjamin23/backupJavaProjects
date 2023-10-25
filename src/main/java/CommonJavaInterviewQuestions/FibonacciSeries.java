package CommonJavaInterviewQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Fibonacci 0 1 1 2 3 5 8 13 21 34

        // 3 variables
        int num = 10;                   // The number of Fibonacci terms to generate
        int t1 = 0;                     // First Fibonacci Term
        int t2 = 1;                     // Second Fibonacci term

        // for loop:
        for (int i = 1; i<=num; i++){   // Loop to generate and print Fibonacci terms
            System.out.println(t1);     // Print the current Fibonacci term

        // Swap:
            int sum = t1 + t2;          // Calculate the next Fibonacci term by summing the previous two
            t1 = t2;                    // Update term1 with the value of term2
            t2 = sum;                   // Update term2 with the newly calculated sum
        }



    }


}
