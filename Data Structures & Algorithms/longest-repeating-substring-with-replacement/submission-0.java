class Solution {
    public int characterReplacement(String s, int k) 
    {
        HashMap < Character , Integer > res = new HashMap<>();

        int low = 0 ; 
        int n = s.length();
        int count = 0 ; 
        int maxFreq = 0 ;

        for ( int right = 0 ; right < n ; right++ )
          {
            char c = s.charAt(right);

            res.put(c,res.getOrDefault(c,0)+1);

            maxFreq = Math.max(maxFreq,res.get(c));

            int windowLength = right - low + 1 ;

            int replace = windowLength - maxFreq ;

            if ( replace > k)
            {
                char leftChar = s.charAt(low) ;

                res.put( leftChar , res.get(leftChar) - 1 );

                low++ ;
            }
            count = Math.max(count, right - low + 1 );
        }
        return count ;
    }
}
