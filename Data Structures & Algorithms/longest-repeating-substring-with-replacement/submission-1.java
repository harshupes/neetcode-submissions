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

            res.put(c,res.getOrDefault(c,0)+1);  // isme saare characters ko daaldo res me 

            maxFreq = Math.max(maxFreq,res.get(c)); // isme sabse jyada aane wale ko lelenge 

            int windowLength = right - low + 1 ; // right me total kitne chale hai aur repeated wale kitne me usme compare hoke +1 kar denge 

            int replace = windowLength - maxFreq ; // isse pata chalega ki kitne bharne hia 

            if ( replace > k)  // ab jitna bhi hai use k ke respect me chala denghe 
            {
                char leftChar = s.charAt(low) ; // isme Low wale ko ya repeated wale ko bhar denge 

                res.put( leftChar , res.get(leftChar) - 1 ); // isme jo bhi left wale me hoha use bharte jayenge 

                low++ ;
            }
            count = Math.max(count, right - low + 1 );
        }
        return count ;
    }
}
