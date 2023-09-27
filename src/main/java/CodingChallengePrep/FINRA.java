package CodingChallengePrep;

public class FINRA {

    public static void main(String[] args) {
        //write a code that prints numbers 1-30 where
        // multiples of 3 print "FIN"
        // multiples of 5 pring "RA"
        // multiples of 3 and 5 pring "FINRA"
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            }if (i % 3 == 0) {
                System.out.println("FIN");
            }if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }

        }
    }
}
