
public class Tabulation {
    public int solve( int[] cost){
        int n = cost.length;
        /* steps
        1. base case
        2. create dp array
        3. initialization
        4. loop ki entry
        5. return*/
        //base case

        //dp[n] and dp[n+1] are by default 0 in java.

        //dp array
        int[] dp = new int[n +2];
        

        for (int i = n-1 ; i>= 0 ; i--){
            dp[i] = Math.max(dp[i+2] + cost[i], dp[i+1]);

        }
        return dp[0];


    }
    
}
