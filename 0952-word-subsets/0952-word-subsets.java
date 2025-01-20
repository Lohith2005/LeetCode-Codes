class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26]; 
        for (String b : words2) {  
            int[] freq = new int[26];  
            for (char ch : b.toCharArray()) {freq[ch - 'a']++;}  
            for (int i = 0; i < 26; i++){maxFreq[i] = Math.max(maxFreq[i], freq[i]);}  
        }  
        List<String> result = new ArrayList<>(); 
        for (String a : words1) {  
            int[] freqA = new int[26];  
            for (char ch : a.toCharArray()) {freqA[ch - 'a']++;}  
            boolean isUniversal = true;  
            for (int i = 0; i < 26; i++) {  
                if (freqA[i] < maxFreq[i]) {  
                    isUniversal = false;  
                    break;  
                }  
            }  
            if (isUniversal) {  
                result.add(a);  
            }  
        }  
        return result; 
    }
}