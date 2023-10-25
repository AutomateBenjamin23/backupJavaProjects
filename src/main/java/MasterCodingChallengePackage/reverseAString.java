package MasterCodingChallengePackage;

public class reverseAString {

    public static void main(String[] args) {
        String name = "!derih si nimajneB";//Benjamin is hired!
        String reverse = "";

        for (int i=name.length()-1; i>=0; i--) {
            reverse = reverse+name.charAt(i);

        }
        System.out.println("Original string = " + name);
        System.out.println("Reverse string = " + reverse);
    }

}
