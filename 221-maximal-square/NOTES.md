1 hai to diagonally neeche, right, down meka min+1 lena hai
​
​
class Solution {
public int maximalSquare(char[][] arr) {
int ans=0;
int dp[][]=new int[arr.length][arr[0].length];
for(int i=dp.length-1;i>=0;i--){
for(int j=dp[0].length-1;j>=0;j--){
if(i==dp.length-1 && j==dp[0].length-1){
dp[i][j]=arr[i][j]-'0';
}
else if(i==dp.length-1 && j!=dp[0].length-1){
dp[i][j]=arr[i][j]-'0';
}
else if(j==dp[0].length-1 && i!=dp.length-1){
dp[i][j]=arr[i][j]-'0';
}
else{
if(arr[i][j]=='0'){
dp[i][j]=0;
}
else{
int min=Math.min(dp[i][j+1],dp[i+1][j]);
min=Math.min(min,dp[i+1][j+1]);
dp[i][j]=min+1;
if(dp[i][j]>ans){
ans=dp[i][j];
}
}
}
}
}
return ans*ans;
}
}