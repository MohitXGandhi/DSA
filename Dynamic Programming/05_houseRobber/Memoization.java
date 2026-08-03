
public class Memoization {
    /*steps
    1. base case
    2.check already in dp[]
    3.recursive function
    4. store in dp[]
    5.return */

    //base case
    public int solve(int n, int[] cost ,int[] dp){
        if(n>= cost.length) return 0;

        //checking
        if(dp[n] != -1) return dp[n];

        //recursive function - function call
        int rob = solve(n+2,cost,dp) +cost[n];
        int skip= solve(n+1,cost,dp);

        //storing in dp[]
        dp[n] = Math.max(rob,skip);

        return dp[n];
    }
    
}
