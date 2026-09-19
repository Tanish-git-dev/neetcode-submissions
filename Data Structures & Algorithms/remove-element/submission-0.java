class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int len = nums.length;
        int count = len;
        for(int i = 0; i < len; i++){
            if(nums[i]==val){
                nums[i] = nums[count-1];
                count--;
                if(i+1 == len) break;
                if(nums[i]==val && nums[i+1]!=val) break;
            }
        }
        return count;
    }
}