package CodingChallengePrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EvenNumbersOnly {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,5,343,12,6,8,9,34,53));
        Iterator<Integer> numit=numbers.iterator();
            while (numit.hasNext()){
                int num = numit.next();
                if (num%2==0){
                    System.out.println(num);
                }
            }
    }
}
