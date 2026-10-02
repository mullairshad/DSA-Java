class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int subArrayCount=0;
        for(int i=0;i<n;i++)
        {
            int product=nums[i];
            if(product<k)
            {
                subArrayCount++;
            }
            for(int j=i+1;j<n;j++)
            {
                product=product*nums[j];
                if(product<k)
                {
                    subArrayCount++;
                }
                else
                {
                    product=0;
                    break;
                }
            }
        }
        return subArrayCount;
    }
}