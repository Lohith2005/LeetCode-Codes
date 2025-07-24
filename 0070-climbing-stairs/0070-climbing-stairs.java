class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==0)return 1;
        int first=1;
        int second=1;
        for(int i=2;i<=n;i++){
            int curr=first+second;
            first=second;
            second=curr;
        }
        return second;
        // return climbStairs(n-1)+climbStairs(n-2); // takes more time
    }
}