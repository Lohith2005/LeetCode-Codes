class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int pn=pref.length();
        int rep=0;
        boolean result=false;
        for(int i=0;i<n;i++){
                result= words[i].length() >=pref.length() && words[i].substring(0,pref.length()).equals(pref);
                System.out.print(" "+words[i]);
                if(result==true) rep++;
        }
        return rep;
    }
}