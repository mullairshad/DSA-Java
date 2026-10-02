class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int leftsum=0;
        int total=0;
        for(int i:nums)
        {
            total+=i;
        }
        for(int i=0;i<n;i++)
        {
            int rightsum=total-nums[i]-leftsum;
            if(leftsum==rightsum)
            {
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}