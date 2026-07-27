class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        
        for (String w : words) {
            int idx = w.charAt(w.length() - 1) - '1'; // Convert 1-based char to 0-based index
            res[idx] = w.substring(0, w.length() - 1);
        }
        
        return String.join(" ", res);
    }
}
