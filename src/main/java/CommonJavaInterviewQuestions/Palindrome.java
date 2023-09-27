package CommonJavaInterviewQuestions;

public class Palindrome {

    public static void main(String[] args) {
        int num = 121;                                          // 3 variables
        int reverse = 0;

        int actualNum = num;

        while (num !=0){                                        // while loop
            int n = num % 10;
            reverse = reverse * 10 + n;
            num = num / 10;
        }
        System.out.println(reverse);                                 //print statement

        if (actualNum == reverse){                                  //if statement
            System.out.println(num + " is a palindrome");
        }else{
            System.out.println(num + " i not a palindrome");
        }

    }
}
