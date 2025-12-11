/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int cnt=0;
        int low=1,high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            //int mid=(low+high)/2;//This will give tle because  of integ overflow 
            //some times doing low + high may add to a number larger than the int bits can store therefore high - low can be lower then that so yes although there final result is same to major difference is how they reach to that part
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