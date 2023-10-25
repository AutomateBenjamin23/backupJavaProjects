package MasterCodingChallengePackage;

public class Palindrome {
    public static void main(String [] Benjamin) {

        String text = "evil olive";
        boolean check = true;

        for(int i=0; i < text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                check = false;
                break;
            }
        }
        System.out.println(check?"Palindrome":"Not Palindrome");


    }

}
