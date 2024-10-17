class Solution {
    public boolean wordPattern(String pattern, String s) {
        char [] ch=pattern.toCharArray();
        String[] ss=s.split("\\s+");
        if(ch.length!=ss.length){
            return false;
        }

        Map<Character,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            if(!map1.containsKey(ch[i])){
                map1.put(ch[i],i);
            }

            if(!map2.containsKey(ss[i])){
                map2.put(ss[i],i);
            }

            if(!map1.get(ch[i]).equals(map2.get(ss[i]))){
                    return false;
            }
        }

        return true;
    }
}