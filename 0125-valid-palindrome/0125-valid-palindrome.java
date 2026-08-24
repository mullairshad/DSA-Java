class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int n=str.length();
        int l=0;
        int r=n-1;
        while(l<r)
        {
            if (str.charAt(l)!=str.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}