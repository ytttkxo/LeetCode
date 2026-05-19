class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // How many of each letters are there
        int[] count = new int[26];

        // Count the number of times each letter appears in the magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            // letter -> index
            int index = c - 'a';

            count[index]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            int index = c - 'a';

            count[index]--;

            if (count[index] < 0) {
                return false;
            }
        }

        return true;
    }
}