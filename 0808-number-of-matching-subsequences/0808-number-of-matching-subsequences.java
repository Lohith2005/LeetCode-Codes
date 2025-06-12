class Solution {    
    public int numMatchingSubseq(String s, String[] words) {
        String inputString = s;
        int count = 0;
               
        for (String word:words) {    
            if (checkSub(word, inputString)) {
                count = count + 1;
            }
        }
        return count;
    }

    
    private boolean checkSub(String word, String inputString){
        int prevCharIndex = 0;
        for (char ch : word.toCharArray()) {
 
            int index = inputString.indexOf(ch, prevCharIndex);
            if (index == -1) {
                return false;
            }
            prevCharIndex = index + 1;
        }
        return true;  
    }
}