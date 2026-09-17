class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int left=0;
        int mid=0;
        int right=n-1;
        int temp;
        while(mid<=right)
        {
            if(nums[mid]==0)
            {
                temp=nums[mid];
                nums[mid]=nums[left];
                nums[left]=temp;
                left++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                temp=nums[right];
                nums[right]=nums[mid];
                nums[mid]=temp;
                right--;
            }
        }
    }
}