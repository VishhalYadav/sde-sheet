class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int res = -1;
        int i = 0;

        while(i<nums.length){
            if(i!=nums[i]){
                res = i;
                break;
            }
            i++;
        }

        if(res==-1 && nums[nums.length-1]==nums.length-1){
            res = nums.length;
        }

        return res;

        
    }
}