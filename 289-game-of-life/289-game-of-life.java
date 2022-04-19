class Solution {
    public void gameOfLife(int[][] board) {
        
        int dirs[][] = {{0,1},{1,0},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                int live = 0 ;
                
                for(int dir[] : dirs){
                    int x = dir[0];
                    int y = dir[1];
                    
                    if(x+i < 0 || x+i >= board.length || y+j <0 || y+j >= board[0].length) continue;
                    if(board[x+i][y+j] == 1 || board[x+i][y+j] == 2) live++;
                }
                
                 if(board[i][j] == 0 && live == 3) board[i][j] = 3;
            if(board[i][j]==1 && (live<2 || live>3)) board[i][j]=2;
                
            }
            
           

        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j]%=2;
            }
        }
   
        
    }
}