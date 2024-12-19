
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int diff = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }

            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }

        diff = max - min;

        return diff;
    }
}
