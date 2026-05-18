class Solution {
    public int removeElement(int[] nums, int val) {
        // slow pointer -> next position we should put volid element
        int k = 0;

        // i -> quick pointer: scan the whole array from left to right
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}