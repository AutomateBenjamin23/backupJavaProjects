package dailyByte;
//This question is asked by Amazon. Given a string representing your stones and another string representing
// a list of jewels, return the number of stones that you have that are also jewels.
public class jewelsAndStones {

    public static int numJewelsAndStones(String J, String S) {
        int count = 0;
        for (char stone : S.toCharArray()) {
            if (J.indexOf(stone) != -1) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        //jewels = "abc",
        // stones = "ac", return 2
        //jewels = "Af",
        // stones = "AaaddfFf", return 3
        //jewels = "AYOPD",
        // stones = "ayopd", return 0
        String J= "abc";
        String S= "ac";
        int numJewels = numJewelsAndStones(J,S);
        System.out.println("Number of Jewels: " + numJewels);


    }
}
