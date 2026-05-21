class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Determine whether there are identical structures
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the greatest common divisor
        int gcdLen = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLen);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;

            a = b;
            b = temp;
        }

        return a;
    }
}