
public class recursion {
    public int solve (int i , int[] cost){
        //recursion
        //base case ;
        // recursive calls ; 
        // currrent answer;

        //base case;
        if( i == 0 ) return cost[0];
        if( i == 1) return cost[1];

      //recursive calls for reaching stair with its cost add.
        int oneStep = solve(i-1,cost) + cost[i];
        int twoStep = solve(i-2, cost)+ cost[i];

        return Math.min(oneStep, twoStep);
       
    }
    public int topStair(int[] cost){
        int n = cost.length;
        return Math.min(solve(n-1, cost), solve(n-2,cost));
        //for TOP because it does not have any cost to add.
    }
    
}
