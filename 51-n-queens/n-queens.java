class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solveNQueens(n,ans,board,0);
        return ans;        
    }
    private boolean isSafe(int n,char [][]board,int row,int col){
        //check for each col
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        //check for upperleft diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        //check for upper right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
    private void solveNQueens(int n,List<List<String>>ans,char[][]board,int row){
        if(row==n){
            List<String>sol=new ArrayList<>();
            for(char[]rowArray: board){
                sol.add(new String(rowArray));
            }
            ans.add(sol);
            return;
        }
        for (int col = 0; col < n; col++) {
            // If current position is safe
            if (isSafe(n, board, row, col)) {
                // Place queen
                board[row][col] = 'Q';
                // Recursively solve for next row
                solveNQueens(n, ans, board, row + 1);
                // Backtrack: remove queen for trying next position
                board[row][col] = '.';
            }
        }
    }
}