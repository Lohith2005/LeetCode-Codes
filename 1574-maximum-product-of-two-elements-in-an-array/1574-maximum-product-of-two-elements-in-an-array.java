class Solution {
    public int maxNum(int a,int b){
        if(a>b)return a;
        else return b;
    }
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(i==j)continue;
                int prod=(nums[i]-1)*(nums[j]-1);
                max=maxNum(prod,max);
            }
        }
        return max;
    }
}