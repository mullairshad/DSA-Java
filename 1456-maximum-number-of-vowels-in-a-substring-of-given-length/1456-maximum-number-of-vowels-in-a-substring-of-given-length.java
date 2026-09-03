class Solution {
    public int maxVowels(String s, int k) {
        int n =s.length();
        int count=0;
        int max_cnt=0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        max_cnt=count;
        for(int i=k;i<n;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
            if(isVowel(s.charAt(i-k)))
            {
                count--;
            }
            max_cnt=Math.max(max_cnt,count);
        }
        return max_cnt;
    }
    public boolean isVowel(char i)
    {
        return (i=='a'||i=='e'||i=='i'||i=='o'||i=='u');
    }
}