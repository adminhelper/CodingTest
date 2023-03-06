class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        for(int i : nums) {
            if(i == 1) {
                count++;
                if(result < count)
                    result = count;
            } else {
                count = 0;
            }
        }
        return result;
    }
}