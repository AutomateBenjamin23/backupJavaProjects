package NaveenAutomation.java.LambdaConcept;

public class LambdaDeclaration {

    public static void main(String[] args) {

        WebPage w1 = (value) ->  { System.out.println("Hi " + value ); }; //Lambda expression
        WebPage w2 = (value) ->    System.out.println(value.toUpperCase());
        WebPage w3 = (n) ->    System.out.println(n.length());
//
//        WebPage w2 = new WebPage() {
//            @Override
//            public void header(String value) {
//                System.out.println("Goodbye " + value);
//            }
//        };

        w1.header("tom ");
        w2.header("Facebook");
        w3.header("Naveen");
//        w3.header("Naveen", 45);
    }
}
