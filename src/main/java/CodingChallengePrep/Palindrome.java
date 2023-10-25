package CodingChallengePrep;

public class Palindrome {
                                                                    //print Palindrome if it is, "Not Palindrome" if not
    public static void main(String[] args) {

        String text = "evil olive";                          //define the input string to check if its a palindrome
        boolean check = true;                                //Initialize a boolean variable to track if it's palindrome
                                                                    // Loop through half the String chars to check
        for (int i=0; i<text.length()/2; i++){                      // for Palindrome properties
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){     //compare chars from beginning and end of string
                check=false;                                        //if chars don't match => it's not a palindrome
                break;                                              // exit the loop early since we know it's not
            }
        }                                                           //Output the result: "Palindrome" if check is true
        System.out.println(check?"Palindrome":"Not Palindrome");    // or "Not Palindrome" otherwise.
    }
}
