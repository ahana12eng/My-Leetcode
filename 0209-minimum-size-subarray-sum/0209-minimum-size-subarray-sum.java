class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int min=Integer.MAX_VALUE ;
    while(j<nums.length){
            sum=sum+nums[j];
        while(sum>=target){
                int size=j-i+1;
                min=Math.min(min,size);
                sum=sum-nums[i];
                i++;
            }
            j++;
            
        }
        return min==Integer.MAX_VALUE ?0:min;
    }
}