package ArrayOperations;

public class SecondLargestNumberFinderMain {

    public static void main(String[] args) {
        String input1 = "dfa12321afd";
        String input2 = "abc1111";

        int result1 = SecondLargestNumberFinder.findSecondLargest(input1);
        int result2 = SecondLargestNumberFinder.findSecondLargest(input2);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}

