class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        int i = 0;
        
        for(int num : nums) {
            sum += num;
            result[i++] = sum;
        }
        return result;
    }
}