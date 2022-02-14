class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        
        Arrays.sort(edges,(a,b)->(b[0]-a[0]));
        
        int parenta[]=new int[n+1];
         int parentb[]=new int[n+1];
         int ranka[]=new int[n+1];
         int rankb[]=new int[n+1];
        
        for(int i=0;i<parenta.length;i++){
            parenta[i]=i;
            parentb[i]=i;
            ranka[i]=1;
            rankb[i]=1;
        }
        int mergea=1;
        int mergeb=1;
        int removed=0;
        
        for(int edge[]:edges){
            if(edge[0]==3){
                boolean tempa=union(edge[1],edge[2],parenta,ranka);
                 boolean tempb=union(edge[1],edge[2],parentb,rankb);
                
                if(tempa==true){
                    mergea++;
                }
                if(tempb==true){
                    mergeb++;
                }
                if(tempa==false && tempb==false){
                    removed++;
                }
            }
            else if(edge[0]==1){
                boolean tempa=union(edge[1],edge[2],parenta,ranka);
                
                if(tempa==true){
                    mergea++;
                }
                else{
                    removed++;
                }
                
            }
            else{
                
                boolean tempb=union(edge[1],edge[2],parentb,rankb);
                
                if(tempb==true){
                    mergeb++;
                }
                else{
                    removed++;
                }
                
            }
        }
        
        if(mergea!=n || mergeb!=n) return -1;
        
        return removed;
        
        
        
        
    }
    
    int find(int x,int parent[]){
        if(parent[x]==x){
            return x;
        }
        int temp=find(parent[x],parent);
        parent[x]=temp;
        return temp;
    }
    
    boolean union(int x,int y,int parent[],int rank[]){
        int px=find(x,parent);
        int py=find(y,parent);
        
        if(px!=py){
            if(rank[px]>rank[py]){
                parent[py]=px;
            }
            else if(rank[px]<rank[py]){
                parent[px]=py;
            }
            else{
                parent[px]=py;
                rank[py]++;
            }
            return true;
        }
        
        return false;
        
    }
    
    
}