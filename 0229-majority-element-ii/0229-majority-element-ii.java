class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int el1=0,el2=0;

        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!=el2){
                c1++;
                el1=nums[i];
            }
            else if(c2==0 && nums[i]!=el1){
                c2++;
                el2=nums[i];
            }

            else if(el1==nums[i]){
                c1++;
            }
            else if(el2==nums[i]){
                c2++;
            }

            else {
                c1--;
                c2--;
            }

        }


        int cmt1=0,cmt2=0;
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i])cmt1++;
            else if(el2==nums[i])cmt2++;
        }

        List<Integer>list=new ArrayList<>();
        if(cmt1>nums.length/3){
            list.add(el1);
        }
        if(cmt2>nums.length/3){
            list.add(el2);
        }

        return list;
    }
}