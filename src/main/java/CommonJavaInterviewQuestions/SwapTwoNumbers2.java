package CommonJavaInterviewQuestions;

public class SwapTwoNumbers2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("before swapping: ");
        System.out.println("a=" +a);
        System.out.println("b=" +b);

        System.out.println("after swapping:");

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
