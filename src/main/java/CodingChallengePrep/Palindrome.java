package CodingChallengePrep;

public class Palindrome {

    public static void main(String[] args) {
        //print Palindrome if it is, "Not Palindrome" if not
        String text = "racecar";
        boolean check = true;

        // removes Spaces and converts to lowercase for case-insensitivity check
        String cleanText = text.replaceAll("\\s", "").toLowerCase();

        for (int i=0; i<text.length()/2; i++){
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
                check=false;
                break;}
        }
        System.out.println(check?"Palindrome":"Not Palindrome");

    }

}
