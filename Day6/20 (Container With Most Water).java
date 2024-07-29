class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxwater = Integer.MIN_VALUE;

        while (l < r) {
            int water = (r-l) * Math.min(height[l], height[r]);

            maxwater = Math.max(water, maxwater);

            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxwater;
    }
}