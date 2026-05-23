class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char source = s.charAt(i);
            char target = t.charAt(i);

            // The same character is mapped to two different characters
            if (sToT.containsKey(source) && sToT.get(source) != target) {
                return false;
            }

            //If the target has already been mapped to a source, then it must still correspond to the same source
            if (tToS.containsKey(target) && tToS.get(target) != source) {
                return false;
            }

            // no conflict
            sToT.put(source, target);
            tToS.put(target, source);
        }

        return true;
    }
}