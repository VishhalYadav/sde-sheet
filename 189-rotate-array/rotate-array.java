class Solution {
    public void reverse(int[] arr,int low,int high){
        while(low<high){
            int t = arr[low];
            arr[low] = arr[high];
            arr[high] = t;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        if(n==0) return;
        k = k % n;
        if(k==0) return;

        reverse(nums,0,n-1);
         reverse(nums,0,k-1);
         reverse(nums,k,n-1);
        
    }
}