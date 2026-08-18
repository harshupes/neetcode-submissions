class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0 ; 
        int right = numbers.length - 1;

        while(left<right)
        {
            int complement = numbers[left] + numbers[right];
            
            if (target == complement)
            {
                int num1 = left + 1 ;
                int num2 = right + 1 ;

                return new int[]{num1,num2} ;
            }

            else if ( target > complement)
            {
                left++;
            }

            else 
            {
                right--;
            }

        }
        return new int[]{};
    }
}
