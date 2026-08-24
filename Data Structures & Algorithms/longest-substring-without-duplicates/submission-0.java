class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap < Character , Integer > res = new HashMap<>();

        int n = s.length();
        int count = 0 ;
        int low = 0 ;

        for ( int high = 0 ; high < n ; high++ ){
        char c = s.charAt(high);

        if ( res.containsKey(c))        
        {
            low = Math.max(low, res.get(c)+1);
        }

        res.put(c,high);

        count = Math.max( count , high - low + 1 );
        }
        return count ;
    }
}
