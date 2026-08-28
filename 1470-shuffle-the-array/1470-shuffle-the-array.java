class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[n*2];
        int len=nums.length;
        arr[0]=nums[0];
        arr[len-1]=nums[len-1];
        int i=1;
        int l=1;
        int r=n;
        while(i<len-1)
        {
            arr[i]=nums[r];
            arr[i+1]=nums[l];
            i=i+2;
            l++;
            r++;
        }
        return arr;
    }
}