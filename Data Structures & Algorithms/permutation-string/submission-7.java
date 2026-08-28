class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();

        HashMap<Character, Integer> res = new HashMap<>();

        // s1 ke characters ka count
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            res.put(c, res.getOrDefault(c, 0) + 1);
        }

        int low = 0;

        for (int right = 0; right < s2.length(); right++) {

            // fixed window size
            if (right - low + 1 > n) {
                low++;
            }

            // jab window size n ho
            if (right - low + 1 == n) {

                HashMap<Character, Integer> temp = new HashMap<>(res);

                boolean valid = true;

                for (int i = low; i <= right; i++) {

                    char c = s2.charAt(i);

                    if (!temp.containsKey(c) || temp.get(c) == 0) {
                        valid = false;
                        break;
                    }

                    temp.put(c, temp.get(c) - 1);
                }

                if (valid) {
                    return true;
                }
            }
        }

        return false;
    }
}