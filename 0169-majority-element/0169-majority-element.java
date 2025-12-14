class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int maxval=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()>maxval){
                max=e.getKey();
                maxval=e.getValue();
            }
        }
        return max;

    }
}