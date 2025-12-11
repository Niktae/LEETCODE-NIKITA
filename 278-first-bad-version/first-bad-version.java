/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int cnt=0;
        int low=1,high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)){
                cnt=mid;
                high=mid-1;               
            }
            else{
                low=mid+1;
            }
        }
        return cnt;

    }
}