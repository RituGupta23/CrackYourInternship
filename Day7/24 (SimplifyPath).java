import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        String files[] = path.split("/");
        Deque <String> dq = new ArrayDeque<>();

        for (String file: files) {
            if (file.equals("..")) {
                if (!dq.isEmpty()) {
                    dq.removeLast();
                }
                
            } else if (file.equals(".") || file.equals("")) {
                continue;
            } else {
                dq.addLast(file);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!dq.isEmpty()) {

            sb.append("/" + dq.removeFirst());
        }

        if (sb.toString().length() == 0) {
            return "/";
        }

        return sb.toString();
    }
}