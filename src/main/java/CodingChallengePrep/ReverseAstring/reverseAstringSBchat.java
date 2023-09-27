package CodingChallengePrep.ReverseAstring;

public class reverseAstringSBchat {

    public static void main(String[] args) {
        String originalString = "Hello World";
        StringBuilder reversedString = new StringBuilder(originalString);
        reversedString.reverse();

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString.toString());
    }
}

//In this example, we first initialize a String variable originalString with the string we want to reverse. We then
// create a new StringBuilder object with the originalString as the initial value.  We can then use the reverse()
// method of the StringBuilder class to reverse the characters of the string in place. This method returns a reference
// to the StringBuilder object itself, which allows us to chain the method call with the object creation statement.
// Finally, we print both the originalString and the reversed string, which is obtained by calling the toString() method
// on the StringBuilder object. The reversed string is then printed to the console.  Using StringBuilder is more efficient
// than concatenating strings using the + operator, especially if you need to reverse large strings or perform many
// string manipulation operations.





