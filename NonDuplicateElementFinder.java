package ArrayOperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDuplicateElementFinder {


    public static List<Integer> findNonDuplicateElement(int[] input1) {
        Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : input1) {
            if (!uniqueSet.contains(num)) {
                uniqueSet.add(num);
                uniqueList.add(num);
            }
        }

        return uniqueList;
    }

}





