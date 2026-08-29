class Solution {
    public String minWindow(String s, String t) {
        
        HashMap < Character , Integer > res = new HashMap<>();

        if ( s.length() < t.length() )
        {
            return "" ;
        }

        int count = 0 ;
        int low = 0 ;

        for ( int i = 0 ; i < t.length() ; i++ )
        {
            char c = t.charAt(i);
            res.put(c ,res.getOrDefault(c ,0) +1);
        }

        StringBuilder sb = new StringBuilder();

        for ( int right = 0 ; right < s.length() ; right++ )
        {
            char c = s.charAt(right);

            if ( res.containsKey(c))
            {
                if ( res.get(c) > 0 )
                {
                    count++;
                }
                res.put(c , res.get(c) - 1);
            }

            while ( count == t.length() )
            {
                char leftchar = s.charAt(low);
                if ( sb.length()  == 0 || right - low + 1 < sb.length())
                {
                    sb.setLength(0);
                    sb.append(s.substring(low,right+1));
                }

                if ( res.containsKey(leftchar))
                {
                    res.put(leftchar, res.get(leftchar)+1);

                    if ( res.get(leftchar) > 0)
                    {
                        count--;
                    }
                }
                low++;
            }
        }
        return sb.toString();
    }
}
