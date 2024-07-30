h    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public int mergeSort(int nums[], int s, int e) {
        int count = 0;

        if (s >= e) {
            return count;
        }
        int mid = s + (e-s)/2;

        count += mergeSort(nums, s, mid);
        count += mergeSort(nums, mid+1, e);
        count += countPairs(nums, s, mid, e);

        merge(nums, s, mid, e);

        return count;
    }

    public int countPairs(int nums[], int s, int mid, int e) {
        int count = 0;
        int j = mid + 1; // pointer at right part
        // i => pointer at left part

        for (int i = s; i<=mid; i++) {
            while (j<=e && nums[i] > 2L*nums[j]) j++;
            count += (j - (mid+1));
        }

        return count;
    }

    public void merge(int nums[], int s, int mid, int e) {
        int temp[] = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k =0;

        while (i <= mid && j <= e) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++; k++;
            } else {
                temp[k] = nums[j];
                j++; k++;
            }
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++; k++;
        }

        while (j<=e) {
            temp[k] = nums[j];
            j++; k++;
        }

        for (i = s; i<=e; i++) {
            nums[i] = temp[i-s];
        }

        return;
    }
}