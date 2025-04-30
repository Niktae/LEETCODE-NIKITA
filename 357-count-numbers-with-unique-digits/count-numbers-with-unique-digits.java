class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int cnt=1;
        if(n>=1) cnt+=9;
        int base=9;
        int option=9;
        for(int i=2;i<=n;i++){
            base*=option;
            cnt+=base;
            option--;
        }
        return cnt;
    }
}