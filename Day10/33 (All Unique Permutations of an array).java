import java.util.*;
class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        boolean[] used = new boolean[n];
        ArrayList<Integer> sub = new ArrayList<Integer>();
        permutations(res, arr, n, sub, used);
        
        return res;
    }
    
    static void permutations(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> arr, int n, ArrayList<Integer> sub, boolean[] used){
        if (sub.size() == n) {
            res.add(new ArrayList<>(sub));
            return;
        }
        
        for (int i = 0; i<n; i++) {
            if (used[i] || (i>0 && arr.get(i) == arr.get(i-1) && !used[i-1])) {
                continue;
            }
            
            sub.add(arr.get(i));
            used[i] = true;
            
            permutations(res, arr, n, sub, used);
            
            used[i] = false;
            
            sub.remove(sub.size()-1);
        }
    }
};