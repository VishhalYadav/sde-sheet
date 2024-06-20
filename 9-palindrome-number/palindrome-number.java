class Solution {
    public boolean isPalindrome(int x) {
        int reversed_number = 0;
        int actual_number = x;

        while(x>0){
            int temp = x%10;
            reversed_number = reversed_number*10 + temp;
            x = x/10;
        }

        if(reversed_number==actual_number)return true;
        else return false;
    }
}