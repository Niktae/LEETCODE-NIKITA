class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int first=firstOccurrence(nums,target);
        int last=lastOccurrence(nums,target);
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
    public int firstOccurrence(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(nums[mid]==target){
                res=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public int lastOccurrence(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(nums[mid]==target){
                res=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }

}