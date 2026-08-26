class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int maj_num=nums[0];
        for(int i=0;i<n;i++)
        {
            if(nums[i]==maj_num)
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                maj_num=nums[i];
                count=1;
                
            }
        }
        return maj_num;
    }
}