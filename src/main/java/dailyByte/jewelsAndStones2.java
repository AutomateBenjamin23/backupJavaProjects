package dailyByte;

import java.util.HashMap;

//This question is asked by Amazon. Given a string representing your stones and another string representing
// a list of jewels, return the number of stones that you have that are also jewels.
public class jewelsAndStones2 {
    //jewels = "abc",
    // stones = "ac", return 2
    //jewels = "Af",
    // stones = "AaaddfFf", return 3
    //jewels = "AYOPD",
    // stones = "ayopd", return 0

    public static int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> jewelCounts = new HashMap<>();

        //count the jewels
        for (char jewel : J.toCharArray()){
            jewelCounts.put(jewel, jewelCounts.getOrDefault(jewel, 0)+1);
        }
        int jewelCount = 0;

        //check if stones are jewels
        for (char stone : S.toCharArray()) {
            if (jewelCounts.containsKey(stone)) {
                jewelCount++;
            }
        }
        return jewelCount;
    }

    public static void main(String[] args) {
        String J= "";
        String S= "";
        int numJewels = numJewelsInStones(J, S);
        System.out.println("Number of jewels: " + numJewels);
    }
}
