class Solution {
    public void sortColors(int[] arr) {
        // int r = 0, w = 0, b = 0;

        // for (int col: nums) {
        //     if (col == 0) {
        //         r++;
        //     } else if (col == 1) {
        //         w++;
        //     } else {
        //         b++;
        //     }
        // }

        // int i = 0;
        // while(r != 0) {
        //     nums[i] = 0;
        //     i++;
        //     r--;
        // }

        // while(w != 0) {
        //     nums[i] = 1;
        //     i++;
        //     w--;
        // }

        // while(b != 0) {
        //     nums[i] = 2;
        //     i++;
        //     b--;
        // }

        int low = 0, mid = 0, high = arr.length-1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        } 
    }
}