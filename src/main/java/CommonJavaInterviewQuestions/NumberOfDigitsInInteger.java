package CommonJavaInterviewQuestions;

public class NumberOfDigitsInInteger {
    public static void main(String[] args) {

        //1234 --4
        //123 -- 3

        int num = 1234;
        int count = 0;

        while (num !=0){
            num = num/10; //123 12 1
            ++count;// 1 2 3
        }
        System.out.println("number of digits " + count);

    }
}
