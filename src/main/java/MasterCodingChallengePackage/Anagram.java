package MasterCodingChallengePackage;

public class Anagram {

    public static void main(String[] args) {

        String str1= "listen";                  //define two strings to check for anagram properties
        String str2= "silent";

        for (int i=0; i<str1.length(); i++){                               //iterate through the chars in str1
            str2=str2.replaceFirst(""+str1.charAt(i),"");   //remove the first occurrence of the current
        }                                                                   // character from str2

        System.out.println(str2.isEmpty()?"Anagram":"Not Anagram"); // check if str2 is empty, indicating that str1 and
                                                                    // str2 identical sets or "empty"
    }                                                               // print "Anagram" is str2 is empty, otherwise print
                                                                    // "Not Anagram"
}
