class Solution {
    public int lengthOfLastWord(String s) {
       String [] word = s.split(" ");
        return word.length==0?0:word[word.length-1].length();
    }
}