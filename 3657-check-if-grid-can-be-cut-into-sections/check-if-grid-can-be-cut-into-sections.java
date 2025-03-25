class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int [][]xvalue=new int[rectangles.length][2];
        int [][]yvalue=new int[rectangles.length][2];
        for(int i=0;i<rectangles.length;i++){
            xvalue[i][0]=rectangles[i][0];
            xvalue[i][1]=rectangles[i][2];
            yvalue[i][0]=rectangles[i][1];
            yvalue[i][1]=rectangles[i][3];
        }
        return check(xvalue)||check(yvalue);
    }
    private boolean check(int [][] intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int sections=0;
        int maxIdx=intervals[0][1];
        for(int []interval:intervals){
            if (maxIdx<=interval[0]){
                sections++;
            }
            maxIdx=Math.max(maxIdx,interval[1]);
        }
        return sections>=2;
    }
}