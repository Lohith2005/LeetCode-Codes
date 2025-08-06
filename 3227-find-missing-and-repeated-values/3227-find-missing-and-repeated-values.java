class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] arr=new int[n*n];
        int k=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[k++]=(grid[i][j]);
                sum+=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int res[]=new int[2];
        for(int i=0;i<n*n;i++){
            if(arr[i]==arr[i+1]){
                res[0]=arr[i];
                break;
            }
        }
        int m=n*n;
        res[1]=Math.abs(sum-((m*(m+1))/2)-res[0]);
        return res;
    }
}