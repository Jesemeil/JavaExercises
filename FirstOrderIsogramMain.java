package ArrayOperations;


public class FirstOrderIsogramMain {
    public static void main(String[] args) {
        FirstOrderIsogram isogramChecker = new FirstOrderIsogram();


        String text1 = "abcdefghijklmnopqrstuvwxyz";
        String text2 = "hello world";
        String text3 = "pack my box with five dozen liquor jugs";
        String text4 = "The quick brown fox jumps over the lazy dog";
        String text5 = "A quick brown fox jumps over a lazy dog";

        boolean result1 = isogramChecker.isFirstOrderIsogram(text1);
        boolean result2 = isogramChecker.isFirstOrderIsogram(text2);
        boolean result3 = isogramChecker.isFirstOrderIsogram(text3);
        boolean result4 = isogramChecker.isFirstOrderIsogram(text4);
        boolean result5 = isogramChecker.isFirstOrderIsogram(text5);

        System.out.println("Result for text1: " + result1);
        System.out.println("Result for text2: " + result2);
        System.out.println("Result for text3: " + result3);
        System.out.println("Result for text4: " + result4);
        System.out.println("Result for text5: " + result5);
    }
}

