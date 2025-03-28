class Solution {
    public String convert(String s, int numRows) {
      if(numRows == 1) return s;
      StringBuilder res = new StringBuilder();
      int cycleLen = 2 * numRows - 2;

    for (int i = 0; i < numRows; i++) {
        for (int j = i; j < s.length(); j += cycleLen) {
            res.append(s.charAt(j));  // Add the character in the current column
            int secondCharIndex = j + cycleLen - 2 * i;
            if (i != 0 && i != numRows - 1 && secondCharIndex < s.length()) {
                res.append(s.charAt(secondCharIndex));  // Add the character in the diagonal (if any)
            }
        }
    }

    return res.toString();
}
}