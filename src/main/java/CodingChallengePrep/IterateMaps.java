package CodingChallengePrep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMaps {
    public static void main(String[] args) {
        Map<String,String>contacts = new HashMap<String, String>();
            contacts.put("Ali", "Durban");
            contacts.put("Benjamin", "Ruehle");
            contacts.put("Mariya", "Emre");
            contacts.put("Sena", "Gurson");
            contacts.put("Amer", "Jumaa");

            for (String each:contacts.values()){ //method 1
                System.out.println(each);
            }

        Iterator<Map.Entry<String,String>> iterator = contacts.entrySet().iterator(); //method 2
            while (iterator.hasNext()){
                Map.Entry<String,String>entry = iterator.next();
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }


    }
}
