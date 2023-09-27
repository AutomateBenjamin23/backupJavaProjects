package CodingChallengePrep;

public class ReverseASetenceWordByWord {
    public static void main(String[] args) {
        String sentence = "Benjamin works as a tester";
        String reversedSentence = "";

        String[] sentenceArray = sentence.split("");

        for (int i = sentenceArray.length-1; i>=0; i--){
            reversedSentence = reversedSentence + sentenceArray[i] + " "; }
            reversedSentence = reversedSentence.trim();
            System.out.println(reversedSentence);
        }



    }

