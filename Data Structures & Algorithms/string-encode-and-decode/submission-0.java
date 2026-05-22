//import java.util.*;

public class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }

        return res.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {

            int j = i;

            // find delimiter '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));

            // move past '#'
            j++;

            // extract the string
            String word = s.substring(j, j + length);
            res.add(word);

            // move pointer forward
            i = j + length;
        }

        return res;
    }
}