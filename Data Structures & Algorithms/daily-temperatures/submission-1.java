class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length ;
        int[] result = new int[n];


        for ( int i = 0 ; i < n ; i++ )
        {
            int count = 0 ; 
            for ( int next = i + 1 ; next < n ; next++ )
            {
                count++;
                if ( temperatures[i] < temperatures[next])
                {
                    result[i] = count;
                    break;
                }
            }
        }
        return result ;
    }
}
