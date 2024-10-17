class Solution {
    public int lengthOfLastWord(String s) {
        String ss[]=s.trim().split(" ");
      //  String ss=s1.toCharArray();
        int len=ss[ss.length-1].length();
        return len;
    }
}