class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap < Character , Integer > Smap = new HashMap<>();
        HashMap < Character , Integer > Tmap = new HashMap<>();

        for ( int i = 0 ; i < s.length() ; i++ )
        {
            char c = s.charAt(i);
            Smap.put(c,Smap.getOrDefault(c,0)+1);
        }

        for ( int i = 0 ; i < t.length() ; i++ )
        {
            char c = t.charAt(i);
            Tmap.put(c,Tmap.getOrDefault(c,0)+1);
        }

        if ( Smap.equals(Tmap))
        {
            return true;
        }

        else 
        {
            return false ;
        }


    }
}
