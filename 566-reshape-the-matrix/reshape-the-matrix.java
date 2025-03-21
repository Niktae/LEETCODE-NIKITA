class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int reshape[][]=new int[r][c];
        int arr[]=new int[r*c];
        int l=0;
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c) return mat;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                arr[l]=mat[i][j];
                l++;
            }
        }
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                reshape[i][j]=arr[k];
                k++;
            }
        }
        return reshape;
    }
}