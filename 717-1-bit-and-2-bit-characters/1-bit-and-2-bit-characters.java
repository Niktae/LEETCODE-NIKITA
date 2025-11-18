class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int i=0;
        while(i<n-1){
            if(bits[i]==0){
                if(bits[i+1]==1||bits[i+1]==0){
                    i++;
                }
            }
            else{
                i+=2;
            }
        }
        if (i==n-1)return true;
        return false;

    }
}