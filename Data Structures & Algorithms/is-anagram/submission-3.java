class Solution {
    public boolean isAnagram(String s, String t) { 

s = s.toLowerCase(); // lowercase banayenge taaki koi capital letter na bache 
t = t.toLowerCase(); // capitals ki ASCII alag alag hoti hai 

s = s.replace(" ",""); // space hat jayega aise 
t = t.replace(" ",""); // " " ko "" zero space kar denge

int[] counts = new int[26]; // isme 26 diffrent alphabets barenge

for ( int i = 0 ; i < s.length() ; i++){  // length tk loop 
    counts[s.charAt(i) - 'a']++; // s me add hoti rahegi alphabets 
}

for ( int i = 0 ; i < t.length() ; i++){
    counts[t.charAt(i) - 'a']--;  // t se hatati rahegi alphabets
}

for ( int count : counts){
    if (count != 0)  // count 0 hi hona chahiye warna alag alag hai alphabets
        return false;


}
    return true;
    }
}
