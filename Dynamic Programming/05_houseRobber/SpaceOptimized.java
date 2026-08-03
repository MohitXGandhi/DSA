
public class SpaceOptimized {
    public int solve(int[] cost){
        int n = cost.length;
        //base case
        
        int prev1 = 0; //dp[n+1]
        int prev2 = 0;//dp[n+2]

        for(int i = n-1; i>=0; i--){
            int curr = Math.max(prev1 , prev2 + cost[i] );

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;



    }
    
}
