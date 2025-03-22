class Solution {
    public int[][] generateMatrix(int n) {
        int arr[]=new int[n*n];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        int mat[][]=new int[n][n];
        int l=0;
        int left=0,right=n-1,bottom=n-1,top=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                mat[top][i]=arr[l];
                l++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                mat[i][right]=arr[l];
                l++;
            }
            right--;
            if(top<=bottom){  
            for(int i=right;i>=left;i--){
                mat[bottom][i]=arr[l];
                l++;
                }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                mat[i][left]=arr[l];
                l++;
            }
            left++;
            }
        }
        /*ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                res.add(mat[i][j]);
            }
        }
        return res;*/
        return mat;
    }
}