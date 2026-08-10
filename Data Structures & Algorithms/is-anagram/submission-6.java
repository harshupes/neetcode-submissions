class Solution {
    public boolean isAnagram(String s, String t) {

        s.toLowerCase();
        t.toLowerCase();

        if ( s.length() != t.length())
        {
            return false ;
        }

        HashMap< Character , Integer > smap = new HashMap<>();
        HashMap< Character , Integer > tmap = new HashMap<>();

        for ( int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            smap.put(c,smap.getOrDefault(c,0)+1);
        }

        for ( int i = 0 ; i < t.length() ; i++)
        {
            char c = t.charAt(i);
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }

        if ( smap.equals(tmap))
        {
            return true ;
        }
        return false ;

    }
}
