package ArrayOperations;

public class StringImmutabilityExample {
    public static void main(String[] args) {
        String originalString = "Hello";

        String modifiedString = originalString.concat(", World!");

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);


        System.out.println("Are they the same object? " + (originalString == modifiedString));
    }
}

