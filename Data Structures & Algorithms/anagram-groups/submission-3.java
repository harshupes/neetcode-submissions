class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap< String, List<String>> res = new HashMap<>();

        for (String str : strs) {
            String fstr = getString(str);

            if (res.containsKey(fstr))
            {
                res.get(fstr).add(str);
            }
            else {
                List<String> stringg = new ArrayList<>();
                stringg.add(str);
                res.put(fstr, stringg);
            }
        }

        

        return new ArrayList<>(res.values());
    }

    public String getString(String str) {
            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            return new String(arr);
        }
}
