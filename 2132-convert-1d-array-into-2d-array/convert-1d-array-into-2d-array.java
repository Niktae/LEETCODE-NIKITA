class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int [][]mat=new int[m][n];
        int k=original.length;
        if (m*n!=k) return new int[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=original[i*n+j];
            }
        }
        return mat;
    }
}