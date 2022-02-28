class Solution {
    public boolean exist(char[][] board, String word) {
        
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && solve(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    boolean solve(char board[][],int i,int j,String word,int n){
        if(n==word.length()) return true;
        
        if(i<0 || i>=board.length || j>=board[0].length || j<0 || board[i][j]!=word.charAt(n)){
            return false;
        }
        // temporarly visited mark karne ke liye
        char temp=board[i][j];
        board[i][j]='*';
        boolean b1 = solve(board,i-1,j,word,n+1);
         boolean b2 = solve(board,i+1,j,word,n+1);
         boolean b3 = solve(board,i,j-1,word,n+1);
         boolean b4 = solve(board,i,j+1,word,n+1);
        
        board[i][j]=temp;
        
        
        return b1 || b2 || b3 || b4;
        
    }
}