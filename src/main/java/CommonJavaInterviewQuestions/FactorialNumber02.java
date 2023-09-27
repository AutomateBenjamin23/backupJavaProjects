package CommonJavaInterviewQuestions;

public class FactorialNumber02 {

    public static void main(String[] args) {

        int num = 4;
        int fact = 4;
        getFact(num);

    }
    public static void getFact(int num){ //second approach
        int fact = 1;

        for (int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("factorial of "+num + " is :" + fact);


    }
}
