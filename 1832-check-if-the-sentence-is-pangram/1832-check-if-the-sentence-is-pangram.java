class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] charArray = sentence.toCharArray();
        Set<Character> set=new HashSet<>();
        for(int i=0; i<charArray.length; i++){
            set.add(charArray[i]);
        }
        return set.size()==26; 
    }
}