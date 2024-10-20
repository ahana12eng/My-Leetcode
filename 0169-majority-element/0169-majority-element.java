class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                c++;
                el=nums[i];
            }
           else if(nums[i]==el){
                    c++;
            }
            else if(nums[i]!=el){
                c--;
            }
        }
        int cmt=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==el){
                cmt++;
            }
        }

        if(cmt>nums.length/2){
            return el;
        }

        return -1;

    }
}