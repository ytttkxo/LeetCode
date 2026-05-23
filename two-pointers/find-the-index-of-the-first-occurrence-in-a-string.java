class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // If the remaining length is shorter than the needle, it won't work.
        for(int start = 0; start <= n - m; start++) {
            // j indicates the position of the character in needle that has been matched so far
            int j = 0;

            // 1. j has not yet exceeded the length of needle
            // 2. The current two characters are equal
            while (j < m && haystack.charAt(start + j) == needle.charAt(j)) {
                j++;
            }
            
            if (j == m) {
                return start;
            }
        }

        return -1;
    }
}