class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int n = nums.length ;
        int[] ans = new int[ n - k + 1 ];

        Deque<Integer> dq = new ArrayDeque<>();

        int low = 0 ;
        int index = 0 ;

        for ( int high = 0 ; high < n ; high++ )
        {
            while ( !dq.isEmpty() && nums[dq.peekLast()] <= nums[high])
            {
                dq.pollLast();
            }

            dq.offerLast(high);

            if ( dq.peekFirst() < low )
            {
                dq.pollFirst();
            }

            if ( high >= k - 1 )
            {
                ans[index] = nums[dq.peekFirst()];
                index++ ;
                low++ ;
            }
        }
        return ans ;
    }
}