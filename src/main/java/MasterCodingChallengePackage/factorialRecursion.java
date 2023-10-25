package MasterCodingChallengePackage;

public class factorialRecursion {
    public static long calculateFacttorial(int n){
        if (n==0){
            return 1;
        }else{
            return n * calculateFacttorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n =5;
        long result = calculateFacttorial(n);
        System.out.println(n + "! = " + result);

    }
}
