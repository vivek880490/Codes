class Solution {
    public int superEggDrop(int k, int n) {
        Integer qb[][] = new Integer [k+1][n+1];
        return solve(k,n,qb);
        
    }
    
    int solve(int e, int f, Integer qb[][]){
        
        if(f == 0 || f == 1) return f;
        
        if(e == 1) return f;
        
        if(qb[e][f] != null) return qb[e][f];
        
        int ans=Integer.MAX_VALUE;
    int l=1,r=f;
    while(l<=r)
    {
        int mid=(l+r)/2;
        int left = solve(e-1,mid-1,qb);
        int right = solve(e,f-mid,qb);
        int temp = 1 + Math.max(left,right);
        if(left<right)
        {
            l=mid+1;
        }
        else
        {
            r=mid-1;
        }
        ans = Math.min(ans,temp);
    }
    return qb[e][f] = ans;
    }
}