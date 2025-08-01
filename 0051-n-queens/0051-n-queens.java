class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] board=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        backtrack(0,n,board,result);
        return result;
    }
    void backtrack(int row,int n,char[][] board,List<List<String>> result){
        if(row==n){
            result.add(construct(board));
            return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                backtrack(row+1,n,board,result);
                board[row][col]='.';
            }
        }
    }
    boolean isSafe(char[][]board,int row,int col,int n){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1; i>=0 && j<n; i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
    List<String> construct(char[][] board){
        List<String> res=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            res.add(new String(board[i]));
        }
        return res;
    }
}