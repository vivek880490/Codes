class Solution {
    public int slidingPuzzle(int[][] board) {
        
        Queue<String>q=new LinkedList<>();
        
        String tar="123450";
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++)
            {
                sb.append(board[i][j]);
            }
        }

        String initial=sb.toString();
        
        int swapidx[][]={{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{4,2}};
        
        q.add(initial);
        int level=0;
        HashSet<String>vis=new HashSet<>();
        
        while(q.size()>0){
            int size=q.size();
            while(size-->0){
                String rem=q.poll();
                
                if(rem.equals(tar)) return level;
                
                int idx=-1;
                
                for(int i=0;i<rem.length();i++){
                    if(rem.charAt(i)=='0'){
                        idx=i;
                        break;
                    }
                }
                
                int swap[]=swapidx[idx];
                
                for(int i=0;i<swap.length;i++){
                    String tobeadded=swapchar(rem,idx,swap[i]);
                    
                    if(vis.contains(tobeadded)) continue;
                    
                    q.add(tobeadded);
                    vis.add(tobeadded);
                }
             
            }
            level++;
   
        }
        return -1;
        
    }
    
    String swapchar(String rem,int i,int j){
        
        StringBuilder sb=new StringBuilder(rem);
        sb.setCharAt(i,rem.charAt(j));
        sb.setCharAt(j,rem.charAt(i));
        return sb.toString();
    }
}