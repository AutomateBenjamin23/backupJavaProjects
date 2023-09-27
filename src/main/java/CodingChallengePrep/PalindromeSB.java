package CodingChallengePrep;

public class PalindromeSB {

    public static void main(String[] args) {
        String str1="a nut for a jar of tuna"; // yo banana boy, madam in Eden, i'm Adam, do geese see God, a nut for a jar of tuna, never odd or even
        String str2=new StringBuffer(str1).reverse().toString();

        System.out.println(str2);
    }

}
