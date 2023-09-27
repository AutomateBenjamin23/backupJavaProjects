package CodingChallengePrep.ReverseAstring;

public class reverseAstringSB {

    public static void main(String[] args) {
        System.out.println(usingStringBuilder("!derih si nimajneB")); //Benjamin is hired!
    }
    public static String usingStringBuilder(String param1){
        StringBuilder SB = new StringBuilder(param1);
        SB.reverse();
        return SB.toString();
    }
}
