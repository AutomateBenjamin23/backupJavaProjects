package NaveenAutomation.java.LambdaConcept.JDK8;
@FunctionalInterface
public interface Page {
    
    public void greet(); // only 1 abstract method

    public static void test(){ //static method with method body

    }
    default void display(){ //default method allowed with method body

    }
}
