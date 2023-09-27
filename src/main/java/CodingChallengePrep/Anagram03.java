package CodingChallengePrep;

import java.util.Arrays;
import java.util.TreeSet;

public class Anagram03 {
    public static void main(String[] args) {

    }
    public static boolean Same(String str1, String str2){
        str1= new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2= new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);
    }


}
