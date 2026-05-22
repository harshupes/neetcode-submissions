class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1]; // sabse pehle Bucket List banayi jisme saari values store hogi like nums(1,2,3,4,6)
        Map<Integer,Integer> frequencyMap = new HashMap<>(); // fir frequency table banayenge jo ki Map ki Frequency ko rakhega 

        for ( int n : nums){ // nums ko n pe initialise karenge
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1); // Isme hum frequecy pata karlenge +1 aur n se satrt karke
        }

        for ( int key : frequencyMap.keySet()){ // F-Map ke key pair ko key se initiliase
            int frequency = frequencyMap.get(key); // F-Map ke key ko frequency me daalenge
            if (bucket[frequency] == null ){ // frequency agr null  huyi toh 
                bucket[frequency] = new ArrayList<>(); //  naye arraylist me dalenge
            }   
            bucket[frequency].add(key);  // bucket ki frequncy me keys ko add karenge   
        }

        int[] res = new int[k]; // k ki value array ke form me lenge 
        int counter = 0; // 

        for( int pos = bucket.length-1 ; pos >= 0 && counter < k ; pos--){ // piche se loop start hoga sabka dhyaan rakhte huye
            if(bucket[pos] != null ){ // agar position null pe agayi toh-
                for(Integer integer : bucket[pos]) { // -Integer me dalenge
                    res[counter++] = integer; // Counter bada denge ++ karke
                }
            }
        }

        return res;


        
    }
}
