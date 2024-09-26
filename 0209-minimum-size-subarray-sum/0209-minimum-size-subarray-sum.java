class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int  sum=0;
        int min=Integer.MAX_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                    int size=right-left+1;
                    min=Math.min(size,min);
                    sum=sum-nums[left++];
            }

            right++;
        }

        return min==Integer.MAX_VALUE ?0:min;
    }
}