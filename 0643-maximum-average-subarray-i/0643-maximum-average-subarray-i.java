class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double w_sum=0;
        for(int i=0;i<k;i++)
        {
            w_sum=w_sum+nums[i];
        } 
        double max_sum=w_sum;
        for(int i=k;i<n;i++)
        {
            w_sum=w_sum-nums[i-k]+nums[i];
            max_sum=Math.max(max_sum,w_sum);
        }
        return max_sum/k;
    }
}