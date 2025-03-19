class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        int suffix[]=new int[n];
        suffix[n-1]=shifts[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=(suffix[i+1]+shifts[i]%26);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ch=(char)((ch-'a'+suffix[i]%26)%26+'a');
            sb.append(ch);
        }
        return (sb.toString());
    }
}