class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int n:nums){
            if(min>n)min=n;
        }
        return min;
    }
}