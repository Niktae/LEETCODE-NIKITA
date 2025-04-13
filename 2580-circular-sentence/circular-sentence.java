class Solution {
    public boolean isCircularSentence(String sentence) {
        int n=sentence.length();
        if(sentence.charAt(0)!=sentence.charAt(n-1)){
            return false;
        }
        int c=sentence.indexOf(" ");
        if(c==-1) return true;
        while(c!=-1){
            if(sentence.charAt(c-1)!=sentence.charAt(c+1)){
                return false;
            }
            c=sentence.indexOf(" ",c+1);
        }
        return true;
    }
}

        
        