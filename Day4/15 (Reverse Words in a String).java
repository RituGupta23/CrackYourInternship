class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces and replace multiple spaces with a single space
        s = s.trim().replaceAll(" +", " ");
        
        int left = 0;
        int right = s.length() - 1;

        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp.append(ch);
            } else if (ch == ' ') {
                if (ans.length() > 0) {
                    ans.insert(0, ' ');
                }
                ans.insert(0, temp.toString());
                temp.setLength(0);
            }
            left++;
        }

        // Add the last word
        if (temp.length() > 0) {
            if (ans.length() > 0) {
                ans.insert(0, ' ');
            }
            ans.insert(0, temp.toString());
        }

        return ans.toString();
    }
}
