// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}// } Driver Code Ends


class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(word.charAt(0) == board[i][j] && solve(board, word, i, j, 0)){
                    return true;
                }
            }
             
        }
        return false;
    }
    
    boolean solve(char board[][], String word, int i, int j, int n){
        if(n == word.length()) return true;
        
        if(i < 0 || j < 0 || i > board.length-1 || j > board[0].length-1 || word.charAt(n) != board[i][j]){
            
            return false;
        }
        
        char temp = board[i][j];
        board[i][j] = '*';
        
        boolean b1 = solve(board, word, i+1,j,n+1);
        boolean b2 = solve(board, word, i,j+1,n+1);
        boolean b3 = solve(board, word, i-1,j,n+1);
        boolean b4 = solve(board, word, i,j-1,n+1);
        
        board[i][j] = temp;
        
        return b1 || b2 || b3 || b4;
    }
}