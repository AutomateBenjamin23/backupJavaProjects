package CommonJavaInterviewQuestions;

public class PowerOfConcept {

    public static void main(String[] args) {
        //3^4 = 3x3x3x3 = 81
        int base = 2;
        int exponent = 4;
        long result = 1;

        while (exponent !=0){                   //method 1
            result *= base; //result * base
            --exponent;
        }
        System.out.println(result);
        System.out.println("----------------");
        System.out.println(Math.pow(base, exponent)); // or Method 2?

    }
}
