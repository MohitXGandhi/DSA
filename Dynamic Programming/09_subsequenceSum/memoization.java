import java.util.*;
public class memoization {
    public boolean solve(int i , int target , int[][] dp, int[] nums){

        //base cases
        if(target == 0) return true;
        if(i == nums.length) return false ; // reached n-1 without target;

        //already solved
        if(dp[i][target] != -1) return dp[i][target]== 1 ;
         
        // recurrence
        boolean notTake = solve (i +1 , target , dp,nums);

        boolean take = false;
        if(nums[i] <= target) {
            take = solve(i+1 , target - nums[i] , dp , nums);

        }
        //storing
        dp[i][target] = (notTake || take)? 1 : 0 ;

        //return
        return dp[i][target] == 1;


        

    }

    public boolean subsetSumToK(int[] nums , int target){
        int n = nums.length ;
        
        int[][] dp = new int [n][target +1];
        for(int i = 0 ; i<= n; i++){
            Arrays.fill(dp[i] , -1);

        }
        return solve (0, target , dp , nums);
    }
    
}
