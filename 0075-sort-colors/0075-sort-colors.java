class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int middle=0;
        int end=nums.length-1;
        int temp;
       while(middle<=end){
            if(nums[middle]==0){
                 temp=nums[middle];
                nums[middle]=nums[start];
                nums[start]=temp;
                start++;
                middle++;
            }
            else if(nums[middle]==1){
                middle++;
            }
            else if(nums[middle]==2){
                 temp=nums[end];
                nums[end]=nums[middle];
                nums[middle]=temp;
                end--;
            }

        }
    }
}