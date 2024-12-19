
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){ 
        int maxInt1 = Integer.MIN_VALUE;
        int maxInt2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maxInt1) {
                maxInt2 = maxInt1;
                maxInt1 = num;
            } else if (num > maxInt2) {
                maxInt2 = num;
            }
        }

        return maxInt1 + maxInt2;
    }
}