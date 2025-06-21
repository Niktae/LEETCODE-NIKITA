class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        Arrays.sort(people);
        int j=n-1;
        int i=0;
        int cnt=0;
        while(i<=j){
            if(people[i]+people[j]<=limit) {
                cnt++;
                i++;
                j--;
            }
            else if(people[i]+people[j]>limit){
                cnt++;
                j--;                
            }
            else{
                i++;
            }
        }
        return cnt;
    }
}