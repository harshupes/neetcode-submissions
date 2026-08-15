class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap < Integer , Integer > res = new HashMap<>();

        for ( int i = 0 ; i < nums.length ; i++ )
        {
            res.put(nums[i],i);
        }

        for ( int i = 0 ; i < nums.length ; i++ )
        {
            int complement = target - nums[i];

            if ( res.containsKey(complement))
            {
                int j = res.get(complement);

                if ( i != j )
                {  
                return new int[]{i,j};
                }
            }
            
        }
        return new int[]{};
    }
}
