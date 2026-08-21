class Solution {
    public int trap(int[] height) {

        int left = 0 ; 
        int right = height.length - 1 ;

        int leftmax = 0 ;
        int rightmax = 0 ;
        int count = 0 ;

        while ( left < right )
        {
            if ( height[left] <= height[right] )
            {
                if ( height[left] > leftmax )
                {
                    leftmax = height[left];
                }
                else
                {
                    count = count +  leftmax  - height[left] ;
                }
                left++ ;
            }

            else
            {
                if ( height[right] > rightmax )
                {
                    rightmax = height[right];
                }
                else
                {
                    count = count + rightmax - height[right];
                }
                right--;
            }

        }
        return count ;
        
        
    }
}