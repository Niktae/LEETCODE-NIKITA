class Solution {
    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        if (sentence.charAt(0) != sentence.charAt(n - 1)) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (sentence.charAt(i) == ' ') {
                char lastChar = sentence.charAt(i - 1);
                char nextFirstChar = sentence.charAt(i + 1);
                if (lastChar != nextFirstChar) {
                    return false;
                }
            }
        }
        return true;
    }
}


        
        