class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int cnt=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(isvowel(s.charAt(i))){
                cnt++;
            }
            if(i>=k && isvowel(s.charAt(i-k))){
                cnt--;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
    private boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}