package CodingChallengePrep;

import org.w3c.dom.ls.LSOutput;

public class TotalSum {
    public static void main(String[] args) {

        String str = "jav45ai15sgre1at82";
        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num += str.charAt(i);
            }
            if (i == str.length() - 1 || !(str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9')) {
                if (!num.equals("")) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
            System.out.println(sum);
        }

    }
}
