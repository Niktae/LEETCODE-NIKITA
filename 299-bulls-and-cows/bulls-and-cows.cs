public class Solution {
    public string GetHint(string secret, string guess) {
        int bulls=0;
        for(int i=0;i<secret.Length;i++){
            if(secret[i]==guess[i]){
                bulls++;
            }
        }
        int cnt=0;
        char[]gues=guess.ToCharArray();
        for(int i=0;i<secret.Length;i++){
            for(int j=0;j<gues.Length;j++){
                if(secret[i]==gues[j]){
                gues[j]='#';
                cnt++;
                break;
            }
            }
        }
        int cows=cnt-bulls;
        StringBuilder s=new StringBuilder();
        s.Append(bulls);
        s.Append('A');
        s.Append(cows);
        s.Append('B');
        return s.ToString();
    }
}