class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int onescount=0;
        int twoscount=0;
        int zeroscount=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                zeroscount++;
            }
            else if(nums[i]==1)
            {
                onescount++;
            }
            else
            {
                twoscount++;
            }
        }
        int i=0;
        while(zeroscount>0)
        {
            nums[i]=0;
            i++;
            zeroscount--;
        }
        while(onescount>0)
        {
            nums[i]=1;
            i++;
            onescount--;
        }
        while(twoscount>0)
        {
            nums[i]=2;
            i++;
            twoscount--;
        }
    }
}