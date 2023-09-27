package NaveenAutomation.java.LambdaConcept;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {
    public static void main(String[] args) {
        // takes no argument and returns a result:

        getText(() -> "Java");
        getText(() -> "Naveen");
        getText(() -> "Test Automation");


    }

    public static void getText(Supplier<String> text){
        System.out.println(text.get().length());

    }


}
