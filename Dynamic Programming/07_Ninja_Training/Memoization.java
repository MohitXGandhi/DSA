import java.util.*;
public class Memoization {
    /* base case with dp parameter
    already solved?
    recursion loop here
    store in dp array
    return  */
    //base case
    public int solve(int day, int lastTask , int[][] points, int[][]dp){
        int n = points.length;
        int maxi = 0;
        //base case
        if(day == n) return 0;

        //already solved?
        if(dp[day][lastTask] != -1){
            return dp[day][lastTask];
        }

        //recursion loop here
        for (int task = 0 ; task < 3 ; task++){
            if(task != lastTask){
                int activity = points[day][task] + solve(day+1,task , points, dp);
                maxi = Math.max(maxi, activity);
            }
            
        }
        //storing
        dp[day][lastTask] = maxi;
        return dp[day][lastTask];
    }
    public int ninjaTraining(int[][] points){
        int n =points.length;
        // creating dP table
        int[][] dp = new int[n][4];

        //initialize
        for(int i= 0; i<n ; i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(0,3,points,dp);
    }
}
