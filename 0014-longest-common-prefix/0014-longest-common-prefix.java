class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ss=new StringBuilder();

        Arrays.sort(strs);
        char a1[]=strs[0].toCharArray();
        char a2[]=strs[strs.length-1].toCharArray();
        for(int i=0;i< a1.length;i++){
          if(a1[i]!=a2[i]){
            break;
           }

           ss.append(a1[i]);
        }

        return ss.toString();
    }
}