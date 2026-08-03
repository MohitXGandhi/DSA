
public class spaceOptimized {
    /* steps are
    1.base case
    2.loop
    3. shifting 
    4. return  */ 
    public int solve(int n , int[] cost){
        if( n == 0) return cost[0];
        if( n==1 ) return cost[1];
        int prev1 = cost[n-1];
        int prev2 = cost[n-2];

        //Loop
        for(int i = 2; i< n ; i++){
            int curr = Math.min(prev1 + cost[i], prev2 + cost[i]);

            //shifting variables
            prev2 = prev1;
            prev1 = curr;
        }
        return Math.min(prev1, prev2);
    }
    
}
