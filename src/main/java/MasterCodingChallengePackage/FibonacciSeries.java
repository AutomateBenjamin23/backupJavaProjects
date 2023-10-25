package MasterCodingChallengePackage;
public class FibonacciSeries {
    public static void main(String[] args) {

        int numberOfTerms = 10;             // The number of Fibonacci terms to generate
        int term1 = 0;                         // First Fibonacci Term
        int term2 = 1;                      // Second Fibonacci term

        for (int i = 1; i <= 10; i++) {     // Loop to generate and print Fibonacci terms
            System.out.println(term1);      // Print the current Fibonacci term

            int Sum = term1 + term2;        // Calculate the next Fibonacci term by summing the previous two
            term1 = term2;                  // Update t1 with the value of t2
            term2 = Sum;                    // Update t2 with the newly calculated sum
        }
    }
}