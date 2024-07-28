import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i<nums.length; i++) {
            int idx = Math.abs(nums[i]);
            if (nums[idx-1] < 0) {
                res.add(idx);
            } else {
                nums[idx-1] = -nums[idx-1];
            }
        }
        return res;
    }
}