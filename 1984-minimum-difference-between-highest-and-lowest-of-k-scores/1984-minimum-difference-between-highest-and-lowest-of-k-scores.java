class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int min_diff=nums[n-1];
        for(int i=0;i<=(n-k);i++)
        {
            int diff=nums[i+k-1]-nums[i];
            min_diff=Math.min(diff,min_diff);
        }
        return min_diff;
    }
}