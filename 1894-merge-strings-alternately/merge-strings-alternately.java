class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int i,j;
        for(i=0,j=0;i<word1.length()&& j<word2.length();i++,j++){
            s=s+word1.charAt(i)+word2.charAt(j);
        }
        if(i<word1.length()){
            s=s+word1.substring(i,word1.length());
        }
        if(j<word2.length()){
            s=s+word2.substring(j,word2.length());
        }
        return s;
    }
}