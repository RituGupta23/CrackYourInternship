long min = Integer.MAX_VALUE;
        Collections.sort(a);
        for (int i = 0; i<n-m+1; i++) {
            min = Math.min(min, a.get(i+m-1)-a.get(i));
        }
        
        return min;