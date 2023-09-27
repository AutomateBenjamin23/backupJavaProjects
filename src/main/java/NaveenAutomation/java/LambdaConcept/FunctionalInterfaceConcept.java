package NaveenAutomation.java.LambdaConcept;

import java.util.function.Function;

public class FunctionalInterfaceConcept {
    public static void main(String[] args) {

        //Interface Function<T,R> Type Parameters: //*taken from devdocs

        // T- the type of the input
        // R- the type of the result of the function
        Function<String, Integer> func = x -> x.length();

        int len = func.apply("This is Java 11");
        System.out.println(len);

        //chaining function:

        Function<Integer, Integer> func2 = x -> x * 2;

        int result = func.andThen(func2).apply("This is Naveen here");
        System.out.println(result);

    }

}
