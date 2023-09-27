package JavaInterviewNaveen;

public class StringManipulationbyChat {
    public static void main(String[] args) {
        String str = "The rains have started here selenium";
        char target = 's';

        int firstOccurrance = str.indexOf(target);
        int secondOccurrance = str.indexOf(target, firstOccurrance+1);
        int thirdOccurrance = str.indexOf(target, secondOccurrance+1);

        System.out.println("first occurence of 's' found at index: " + target);
        System.out.println("Second occurrence of 's' found at index: " + secondOccurrance);
        System.out.println("Third occurrence of 's' found at index: " + thirdOccurrance);
    }
}
