package CodingChallengePrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAllDataEqualToOne {
    public static void main(String[] args) {

        List<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,2,2,2,3,3,4,5,6,7,8,1,1,1));
        Iterator<Integer>it = list2.iterator();
            while (it.hasNext()){
                int num = it.next();
                if (num==1){
                    it.remove(); }
                }       System.out.println(list2);
            }
    }

