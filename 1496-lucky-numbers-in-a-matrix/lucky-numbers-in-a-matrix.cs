public class Solution {
    public IList<int> LuckyNumbers(int[][] matrix) {
        int m=matrix.Length;
        int n=matrix[0].Length;
        int[] rowmin=new int[m];
        for(int i=0;i<m;i++){
            int min=matrix[i][0];
            for(int j=0;j<n;j++){
                if(matrix[i][j]<min) min=matrix[i][j];
            }
            rowmin[i]=min;
        }
        //for max column
        int[] colmax=new int[n];
        for(int j=0;j<n;j++){
            int max=matrix[0][j];
            for(int i=0;i<m;i++){
                if(matrix[i][j]>max) max=matrix[i][j];
            }
            colmax[j]=max;
        }
    //find lucky number
    List<int>ans=new List<int>();
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==rowmin[i] && matrix[i][j]==colmax[j]){
                ans.Add(matrix[i][j]);
            }
        }
    }
    return ans;
    }
}