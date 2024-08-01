class Solution {
    public boolean isNumber(String s) {
        boolean num = false, exp = false, sign = false, dec = false;

        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = true;
            } else if (ch == 'e' || ch == 'E') {
                if (exp || !num) return false;
                else {
                    exp = true;
                    num = false;
                    dec = false;
                    sign = false;
                }
            } else if (ch == '.') {
                if (dec || exp) return false;
                else {
                    dec = true;
                }
            } else if (ch == '+' || ch == '-') {
                if (sign || num || dec) return false;
                else {
                    sign = true;
                }
            } else {
                return false;
            }
        }

        return num;
    }
}