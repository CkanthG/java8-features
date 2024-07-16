package classes.leetcode;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2){
            return nums.length;
        }
        int index = 2;
        for (int i=2; i<nums.length; i++) {
            System.out.println("index:"+index+"; i:"+i);
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
