class Solution {
    public void solve(char[][] board) {
        
       int m=board.length;
        int n=board[0].length;
        // not possible
        if(m<3 || n<3) return ;
        // first row
       for(int i=0;i<m;i++){
           if(board[i][0]=='O'){
               dfs(board,i,0);
           }
           //last row
           if(board[i][n-1]=='O'){
               dfs(board,i,n-1);
           }
       }
        //first column
        for(int j=1;j<n-1;j++){
            if(board[0][j]=='O'){
                dfs(board,0,j);
            }
            //last column
            if(board[m-1][j]=='O'){
                dfs(board,m-1,j);
            }
            
        }
        
        // covert 'O' to 'X' and '*' to 'O'
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='*') board[i][j]='O';
            }
        }
        
    }
    
    void dfs(char board[][],int i,int j){
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || board[i][j]!='O') return;
        board[i][j]='*';
        
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
    }
}