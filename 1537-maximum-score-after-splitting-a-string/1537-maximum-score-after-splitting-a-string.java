class Solution {
    public int maxScore(String s) {
        int totalones=0;
        int leftzeros=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                totalones++;
            }
        }
        int rightones=totalones;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                leftzeros++;
            }else{
                rightones--;
            }
            int curr=leftzeros+rightones;
            max=Math.max(curr,max);
        }
        return max;
    }
}