package CodingChallengePrep;

public class practiceClass2 {

    public static void main(String[] args) {
        int num = 242;
        int reverse = 0;
        int actualNum = num;

        while (num != 0) {
            int n = num % 10;
            reverse = reverse * 10 + n;
            num = num / 10;
        }

        System.out.println(reverse);

        if (actualNum == reverse) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}

