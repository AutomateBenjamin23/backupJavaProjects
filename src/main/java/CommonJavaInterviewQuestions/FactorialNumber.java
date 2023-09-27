package CommonJavaInterviewQuestions;

public class FactorialNumber {
    public static void main(String[] args) {
        // !5 = 5x4x3x2x1 = 120
        //!4 = 4x3x2x1 = 24
        //!0 = 1 factorial of 0 is 1!
        int num = 4;
        int fact = 1;
//        getFact(num);

        for (int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("factorial of "+num + " is :" + fact);
        System.out.println("-----------------------------");
    }
//    public static void getFact(int num){ //second approach
//        int fact = 1;
//
//        for (int i=1; i<=num; i++){
//            fact = fact * i;
//        }
//        System.out.println("factorial of "+num + " is :" + fact);
//
//
//    }

}
