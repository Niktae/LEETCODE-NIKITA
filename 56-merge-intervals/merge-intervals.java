class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> arr = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] temp = intervals[0];
        for (int i = 1; i < n; i++){
            if (temp[1] >= intervals[i][0]){
                temp[0] = Math.min(temp[0],intervals[i][0]);
                temp[1] = Math.max(temp[1],intervals[i][1]);
            }else {
                arr.add(temp);
                temp = intervals[i];
            }
        }
        arr.add(temp);
        return arr.toArray(new int[arr.size()][]);
    }
}
