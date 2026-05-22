

class Solution {

    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int longestLength = 0;
        Map<Integer, Boolean> exploredMap = new HashMap<>();

        // Mark all numbers as unvisited
        for (int num : nums) {
            exploredMap.put(num, false);
        }

        // Explore sequences
        for (int num : nums) {

            if (exploredMap.get(num)) {
                continue;
            }

            exploredMap.put(num, true);
            int currentLength = 1;

            // Forward direction
            int nextNum = num + 1;
            while (exploredMap.containsKey(nextNum) && !exploredMap.get(nextNum)) {
                exploredMap.put(nextNum, true);
                currentLength++;
                nextNum++;
            }

            // Backward direction
            int prevNum = num - 1;
            while (exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)) {
                exploredMap.put(prevNum, true);
                currentLength++;
                prevNum--;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}
