class Solution {
    public int[] twoSum(int[] nums, int target) {
        int initial = 0;

        for(int i = 0; i < nums.length; i++) {
            initial = i;
            for(int j = initial + 1; j < nums.length; j++) {
                int sum = nums[initial] + nums[j];
                if(sum == target) {
                    int[] newArr = new int[2];
                    newArr[0] = i;
                    newArr[1] = j;
                    return newArr;
                }
            }
        }
        return null;
    }
}