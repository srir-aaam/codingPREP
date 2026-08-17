class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int originalSum = n*(n+1)/2;
        int arraySum = 0;
        for(int i = 0; i < n; i++){
            arraySum = arraySum + nums[i];
        }
        int result = originalSum - arraySum;
        return result;
    }
}