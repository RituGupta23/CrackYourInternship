class Solution {
    public String longestCommonPrefix(String[] strs) {
        // String str = strs[0];
        // for (int i = 1; i < strs.length; i++) {
        //     int j = 0;
        //     while(j<str.length() && j<strs[i].length()) {
        //         if (str.charAt(j) != strs[i].charAt(j)) {
        //             break;
        //         }
        //         j++;
        //     }
        //     str = str.substring(0,j);
        // }

        // return str;

        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        for (int i = 0; i<(Math.min(first.length(), last.length())); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }
}