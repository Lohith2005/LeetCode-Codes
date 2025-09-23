class Solution {
    public String reverseVowels(String s) {
        List<Character> li=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
                li.add(s.charAt(i));
            }
        }
        Collections.reverse(li);
        int j=0;
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
                sb.append(li.get(j++));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}