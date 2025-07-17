class Solution {
    public void sortColors(int[] nums) {
        int arr[] = new int[3];
        for(int n : nums){
            arr[n]++;
        }
        int j = 0;
        int k = 0;
        for(int size : arr){
            int i = 0;
            while(i < size){
                nums[k++] = j;
                i++;
            }
            j++;
        }
    }
}