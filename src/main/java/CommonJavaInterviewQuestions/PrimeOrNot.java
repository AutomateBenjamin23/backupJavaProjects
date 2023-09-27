package CommonJavaInterviewQuestions;

public class PrimeOrNot {
    public static void main(String[] args) {
        // prime is divisible by only 1 and itself ex 13, 17, 29
        int num = 13;
        boolean flag = false;

        for (int i=2; i<=num/2; i++){
            if (num % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }


    }
}
