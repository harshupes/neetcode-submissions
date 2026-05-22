

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray(); // isse sare character alag alag ho jyenge 
            Arrays.sort(chars);                 // sort characters
            String key = new String(chars);     // sorted string as key

            if (!map.containsKey(key)) { // hai ki nhi key me
                map.put(key, new ArrayList<>()); // yeh naye wale arraylist me add karta jayega 
            }

            map.get(key).add(word); // isse check hoga ki hai ki nhi word me aur usko add kar dega 
        }

        return new ArrayList<>(map.values()); // arraylist me map ki value dal dega
    }
}
