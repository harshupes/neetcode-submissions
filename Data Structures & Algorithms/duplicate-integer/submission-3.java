class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> Set = new HashSet<>();

        for ( int num : nums){
        if (Set.contains(num)){
            return true;
        }
        else {
            Set.add(num);
        }
        }

        
        return false ;
    }
}