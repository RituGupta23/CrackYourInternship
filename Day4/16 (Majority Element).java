class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return (nums[(nums.length/2)]);

        int count = 0;
        int candidate = 0;
        for (int num: nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}