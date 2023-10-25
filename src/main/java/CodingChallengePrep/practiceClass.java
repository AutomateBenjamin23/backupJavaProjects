package CodingChallengePrep;

public class practiceClass {

    public static long calculateFactorial(int n){
        if(n==0){
            return 1;
        }else{
            return n * calculateFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        long result = calculateFactorial(n);
        System.out.println(n + "! = " + result);
    }
}

//solution: 5! = 120

