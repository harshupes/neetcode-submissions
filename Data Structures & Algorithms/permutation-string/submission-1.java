class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int low = 0;

        for (int right = 0; right < s2.length(); right++) {

            if (right - low + 1 > s1.length()) {
                low++;
            }

            if (right - low + 1 == s1.length()) {

                HashMap<Character, Integer> temp = new HashMap<>(map);
                boolean possible = true;

                for (int i = low; i <= right; i++) {

                    char c = s2.charAt(i);

                    if (!temp.containsKey(c) || temp.get(c) == 0) {
                        possible = false;
                        break;
                    }

                    temp.put(c, temp.get(c) - 1);
                }

                if (possible) {
                    return true;
                }
            }
        }

        return false;
    }
}