class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)return true;
        if(n<1) return false;
        return n%2==0 && isPowerOfTwo(n/2);
    }
}