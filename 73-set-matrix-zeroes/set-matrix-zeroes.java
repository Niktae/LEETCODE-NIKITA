class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean arr1[]=new boolean[m];
        boolean arr2[]=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    arr1[i]=true;
                    arr2[j]=true;
                }
            }
        } 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]|| arr2[j]){
                    matrix[i][j]=0;
                }
            }
        }   
    }
}