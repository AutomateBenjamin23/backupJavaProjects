package dailyByte;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "cat";
        String reverse = "";

        for (int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Original String " + str);
        System.out.println("Reversed String " + reverse);
        System.out.println("--------------------------------");

        String name = "The Daily Byte";
        String reversed1 = "";

        for (int i =name.length()-1; i>=0; i--){
            reversed1 = reversed1+name.charAt(i);
        }
        System.out.println("String original: " + name);
        System.out.println("String reversed1 = " + reversed1);
        System.out.println("--------------------------------");











    }
}
