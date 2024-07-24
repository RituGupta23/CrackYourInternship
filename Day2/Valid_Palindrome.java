class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        int count = 0;

        while (l <= r) {
            char left = s.charAt(l);
            char right = s.charAt(r);
            if (left != right) {

                if (left != s.charAt(r-1)) {
                    count++;
                    l++;
                }
                if (right != s.charAt(l+1)) {
                    count++;
                    r--;
                }
            } 
            l++;
            r--;

            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}