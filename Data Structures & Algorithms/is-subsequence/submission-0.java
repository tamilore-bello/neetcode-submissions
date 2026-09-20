class Solution {
    public boolean isSubsequence(String s, String t) {
        int ps = 0;
        int pt = 0;
        while (ps < s.length() && pt < t.length()) {
            if (s.charAt(ps) == t.charAt(pt)) ps++;
            pt++;
        }
        if (ps == s.length()) return true;
        return false;
    }
}

// basically keep a pointer on both strings.
// when a char from 1 is found in 2, advance 1. always advance 1. 
// stop whenever 1 or 2 reached length-1.
// if 1 is at length-1 return true. else return false. 