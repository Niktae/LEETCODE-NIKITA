class Solution {
    public int arrangeCoins(int n) {
        int cnt=0; 
        if (n==1) return 1;
        if(n==0) return 0;
        int i=1;
        while(i<=n){
            if(i<=n){
                cnt++;
                n-=i;
                i++;
            }
        }
        return cnt;
    }
}