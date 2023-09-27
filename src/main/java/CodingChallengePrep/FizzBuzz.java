package CodingChallengePrep;

import java.sql.SQLOutput;

// print out numbers 1-100
//print "Fizz" if divisible by 3
// print "Buzz" if divisible by 5
//pring "FizzBuzz if divisible by 3 & 5
public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i<=100; i++){                   // for loop
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");         //if else statements
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }


    }

}
