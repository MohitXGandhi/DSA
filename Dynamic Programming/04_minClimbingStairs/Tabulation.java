
public class Tabulation {
    /*tabulation steps
    1. base case
    2.make dp array
    3. initialize
    4. loop
    5. return */
    public int solve(int n, int[] cost){
        //base case
        if(n==0) return cost[0];
        if(n==1) return cost[1];

        //dp array
        int[] dp = new int[n+1];
        //initialize;
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        //loop
        for(int i = 2; i< n ; i++){  //i<n or i<=n-1
            dp[i] = Math.min(dp[i-1] + cost[i], dp[i-2] + cost[i]);

        }
        return Math.min(dp[n-1], dp[n-2]);
    }
    
}
