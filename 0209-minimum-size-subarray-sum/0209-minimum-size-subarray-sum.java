class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int minwindow=Integer.MAX_VALUE;
       while(right<nums.length){
            sum+=nums[right++];
            while(sum>=target){
                int size=right-left;
                minwindow=Math.min(minwindow,size);
                sum-=nums[left];
                left++;

            }
        }
        return minwindow==Integer.MAX_VALUE ?0: minwindow;
        
    }
}