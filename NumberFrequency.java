package ArrayOperations;

public class NumberFrequency {

    public static int findMostFrequentNumber(int[] nums) {

        int mostFrequentNumber = nums[0];
        int maxFrequency = 1;

        for (int index = 0; index < nums.length; index++) {
            int currentNumber = nums[index];
            int currentFrequency = 1;

            for (int j = index + 1; j < nums.length; j++) {
                if (nums[j] == currentNumber) {
                    currentFrequency++;
                }
            }

            if (currentFrequency > maxFrequency) {
                mostFrequentNumber = currentNumber;
                maxFrequency = currentFrequency;
            }
        }

        return mostFrequentNumber;
    }


}

