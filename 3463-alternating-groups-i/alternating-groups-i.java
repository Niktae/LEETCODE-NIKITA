class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int cnt=0;
        int n=colors.length;
        if(colors[0]==colors[n-2] && colors[0]!=colors[n-1]) cnt++;
        if(colors[1]==colors[n-1] && colors[1]!=colors[0])cnt++;
        for(int i=0;i<=colors.length-3;i++){
            if(colors[i]==colors[i+2] && colors[i]!=colors[i+1]){
                cnt++;
            }
        }
        return cnt;
    }
}