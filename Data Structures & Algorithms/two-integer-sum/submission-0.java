class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            temp = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j]==temp){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}