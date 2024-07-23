class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int ptr = 1;

        while (ptr < nums.length) {
            if (nums[k] != nums[ptr]) {
                k++;
                nums[k] = nums[ptr];
            }
            ptr++;
        }

        k++;
        return k;
    }
}