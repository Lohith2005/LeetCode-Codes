class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] finalresult=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(target==nums[i]+nums[j]){
                    finalresult[0]=i;
                    finalresult[1]=j;
                    return finalresult;
                    
                }
            }
        }
        return finalresult;
    }
}