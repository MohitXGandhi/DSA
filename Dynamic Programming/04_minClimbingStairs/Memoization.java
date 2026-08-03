

public class Memoization {
/*// 5 steps:
1. base cases
2. check already solved?
3. recursive calls
4. store ans in dp[]
5.return 
 */ 
public int solve(int n, int[] cost, int[] dp){

    //base case
    if( n == 0) return cost[0];
    if(n == 1) return cost[1];

    //2.checking already sort?
    if(dp[n] != -1){
        return dp[n];

    }
    //3.recursive call mtlb function call
    
    int oneStep = solve(n-1 , cost , dp) + cost[n];
    int twoStep = solve(n-2, cost, dp) + cost[n];

    //4. store in dp[]
    dp[n] =Math.min(oneStep , twoStep);
    //5. return dp[]
    return dp[n];
} 
/*
space complexity = O(n)'
time complexity = O(n)' */

    
}
