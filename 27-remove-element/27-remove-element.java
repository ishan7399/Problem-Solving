class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length ==0)return 0;
        int j = 0;
    //  [0,1,2,2,3,0,4,2]
        for (int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
               j++;
            }
        }
        return j;
    }
}