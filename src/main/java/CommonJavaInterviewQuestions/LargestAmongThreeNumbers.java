package CommonJavaInterviewQuestions;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int z = 300;

//        if (x>y && y>z){                              //first way
//            System.out.println("x is the greatest");
//        }else if (y>z){
//            System.out.println("y is the greatest");
//        }else {
//            System.out.println("z is the greatest");
//        }

        if (x >= y) {
            if (y >= z) {

            } else {
                System.out.println("z is the greatest");
            }
        } else {
            if (y >= z) {
                System.out.println("y is the greatest");
            } else {
                System.out.println("z is the greatest");
            }

        }
    }
}
