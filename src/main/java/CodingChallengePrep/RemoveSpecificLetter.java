package CodingChallengePrep;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveSpecificLetter {
    public static void main(String[] args) {
        String[] namesArray = {"Ali", "Amer", "Benjamin", "Sena", "Mariya", "Hilal", "Menaf",};
        Set<String> namesSet = new LinkedHashSet<>();
        namesSet.addAll(Arrays.asList(namesArray));
        Iterator<String>namesSetIterator=namesSet.iterator(); //returns an Array of "namesSet"
            while (namesSetIterator.hasNext()){
                String str=namesSetIterator.next();
                    if (str.toLowerCase().contains("e")){
                        namesSetIterator.remove(); }
                    }
                    System.out.println(namesSet);
            }
    }

