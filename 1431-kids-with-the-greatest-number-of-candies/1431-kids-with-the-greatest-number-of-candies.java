class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> li=new ArrayList<>();
        int max=0;
        for(int candy:candies)
        {
            max=Math.max(max,candy);
        }
        for(int candy:candies)
        {
            candy=candy+extraCandies;
            if(candy>=max)
            {
                li.add(true);
            }
            else
            {
                li.add(false);
            }
        }
        return li;
    }
}