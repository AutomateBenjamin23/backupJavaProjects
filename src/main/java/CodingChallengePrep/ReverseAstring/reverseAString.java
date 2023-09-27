package CodingChallengePrep.ReverseAstring;

import java.text.Format;

public class reverseAString {

    public static void main(String[] args) {
        String name = "Benjamin is hired";//
        String reverse = "";

        for (int i=name.length()-1; i>=0; i--) {
            reverse = reverse+name.charAt(i);

        }
        System.out.println("Original string = " + name);
        System.out.println("Reverse string = " + reverse);
    }
}
// In this example, we first initialize a String variable originalString with the string we want to reverse.
// We then initialize an empty String variable reversedString.
// Next, we use a for loop to iterate through each character of the originalString in reverse order,
// starting from the last character (which has index originalString.length() - 1) and going backwards until the first
// character (which has index 0).  Inside the loop, we append each character to the reversedString variable by using
// the charAt() method of the String class to get the character at the current index, and then concatenating it to
// reversedString using the + operator.  Finally, we print both the originalString and reversedString variables to
// the console to verify that the string has been successfully reversed.