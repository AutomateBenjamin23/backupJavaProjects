package CodingChallengePrep;

public class HowManyTimes {

    public static void main(String[] args) {
        String str0 = "CyberTek";
        int letterCouner = 0;
        str0 = str0.toLowerCase();
        String usedLetters = "";

        for (int i = 0; i < str0.length(); i++) {
            letterCouner = 0;
            if (usedLetters.contains(str0.charAt(i) + ""))
                continue; //if we used the letter before it will skip this loop
            for (int j = 0; j < str0.length(); j++) {
                if (str0.charAt(i) == str0.charAt(j)) {
                    letterCouner++;
                }
            }
            System.out.println(str0.charAt(i) + "=" + letterCouner);
            usedLetters += str0.charAt(i); //creating a new string from the letters coming out of the loop so
            // we don't count them again and have the unique letters only
        }
    }
}