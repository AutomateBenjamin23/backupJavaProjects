package NaveenAutomation.java;

public class B extends A{

    public B(){
        super(10, 20);
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        B obj = new B();
    }

}
