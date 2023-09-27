package JavaInterviewNaveen;

public class reverseString {

    public static void main(String[] args) {
        String s = "Selenium";

        // using for loop
        int len = s.length(); //8
        String rev = "";

        for (int i = len-1; i>=0; i--){
            rev = rev + s.charAt(i); //muineleS
            System.out.println(rev);
            System.out.println("----------------------------------");
        }
//        System.out.println(rev);
        System.out.println("-------------------------");
        //2. using StringBuffer class:
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());

    }
}
