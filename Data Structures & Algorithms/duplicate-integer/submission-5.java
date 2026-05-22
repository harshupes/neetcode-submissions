class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> mp = new HashSet<>();

        for ( int num : nums){
            if(mp.contains(num)){
                return true;
            }
            else {
                mp.add(num);
                }
        }
        return false;
    }
}