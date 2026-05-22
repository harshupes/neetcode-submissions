class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer > set = new HashSet<>(); // HashSet banega 

        for ( int num : nums){ // naye num ko given nums tk chaleyenge 
            if(set.contains(num)){ // content me hai ki nhi 
                return true; 

            }
                set.add(num); // Set me add kar denge

        }
        return false; // agar yeh sab ho gya toh flse 
    }
}