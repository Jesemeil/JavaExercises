package ArrayOperations;

public class NumberAdder {
    public static int addNumbers(String input) {
        int sum = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }
        return sum;
    }

}




