class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int lastMax = 0; int currMax = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currMax++;
            }
            if(nums[i]!=1){
                lastMax = Math.max(currMax,lastMax);
                currMax = 0;
            }
        }

        lastMax = Math.max(currMax,lastMax);

        return lastMax;
        
    }
}