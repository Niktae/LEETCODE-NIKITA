class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int i=0;
        ArrayList<int[]> arr=new ArrayList<>();
        while(i<n && intervals[i][1]<newInterval[0]){
            arr.add(intervals[i]);
            i+=1;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        arr.add(newInterval);
        while(i<n){
            arr.add(intervals[i]);
            i++;
        }
        return arr.toArray(new int[arr.size()] []);
    }
}