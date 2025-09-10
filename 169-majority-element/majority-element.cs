public class Solution {
    public int MajorityElement(int[] nums) {
        int n=nums.Length;
       Dictionary<int,int> freq=new Dictionary<int,int>();
       foreach(int num in nums){
        if(freq.ContainsKey(num)){
            freq[num]++;
        }
        else{
            freq[num]=1;
        }
        if(freq[num]>n/2){
            return num;
        }
       }
        return -1;
        
    }
}