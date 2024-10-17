class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int compo=target-numbers[i];
            if(map.containsKey(compo)){
                return new int[]{map.get(compo)+1,i+1};
            }

            map.put(numbers[i],i);
        }

        return new int[]{};
    }
}