class Solution {
    public int strStr(String haystack, String needle) {
        // int n = haystack.length();
        // int m = needle.length();

        // if (m == 0) {
        //     return 0;
        // }

        // if (n<m) {
        //     return -1;
        // }

        // for (int i = 0; i<=n-m; i++) {
        //     int temp = i;
        //     int j = 0;
        //     for (j = 0; j < m; j++) {
        //         if (needle.charAt(j) != haystack.charAt(temp)) {
        //             break;
        //         }
        //         temp++;
        //     }
        //     if (j == m) {
        //         return i;
        //     }
        // }

        // return -1;

        return haystack.indexOf(needle);
    }
}