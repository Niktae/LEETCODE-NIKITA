class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=Integer.MAX_VALUE;
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long  ans=0;
            for(int i=0;i<n;i++){
                ans+=(long)Math.ceil((double)piles[i]/mid); 
            }
            if(ans<=h){
                min=Math.min(min,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return min;
    }
}