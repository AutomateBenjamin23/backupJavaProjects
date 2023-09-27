package CodingChallengePrep;

public class JavaHowManyTimes02 {

    public static void main(String[] args) {
        String str = "burada java yazdik ki Java kacta gesiyor bul ve java sayisini yazdir";
        int javaCounter=0;
        str = str.toLowerCase();//to make the str case insensitive

        while (str.contains("java")){
            javaCounter++;
            str = str.replaceFirst("java",""); // this will replace java with an empty string and return the remaining str.
        }
        System.out.println(javaCounter);
    }

}
