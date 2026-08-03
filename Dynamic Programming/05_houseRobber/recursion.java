
public class recursion {
    public int solve(int n , int[] cost){
        //1. base case
        if(n>= cost.length){
            return 0;
        }

        //recursiov call - function call
        int rob = solve(n+2 , cost)+ cost[n];
        int skip = solve(n+1,cost);

        return Math.max(rob, skip);
    }

    
}
