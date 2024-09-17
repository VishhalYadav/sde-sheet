class Solution {
    public void moveZeroes(int[] nums) {
        int res = -1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res++;
                int temp = nums[i];
                nums[i] = nums[res];
                nums[res] = temp;

            }
        }
    }
}