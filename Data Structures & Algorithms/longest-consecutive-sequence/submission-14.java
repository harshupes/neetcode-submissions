class Solution {
    public int longestConsecutive(int[] nums) {
        
        if ( nums.length == 0 )
        {
            return 0 ;
        }
        HashMap < Integer , Integer > res = new HashMap<>();


        int longest = 0 ;

        for ( int num : nums)
        {
            res.put(num,1);
        }

        for ( int num : nums )
        {
            if(!res.containsKey(num-1))
            {
                int current = num ;
                int count = 1 ;

                while ( res.containsKey(current + 1 ))
                {
                    current++;
                    count++;
                }

                longest = Math.max(longest,count);
            }
        }
        return longest ;

        
    }
}
