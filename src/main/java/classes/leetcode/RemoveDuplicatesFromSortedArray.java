package classes.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        int[] temp = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            if(set.add(nums[i])) {
                temp[count++] = nums[i];
            }
        }
        System.arraycopy(temp, 0, nums, 0, count);
        return count;
    }
}
