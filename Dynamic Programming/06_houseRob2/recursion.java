
public class recursion {
    public int solve(int[] cost, int i, int end){
        
        //1. base case
        
        if(i> end) return 0;

        //recursion - function cal
        int rob = solve(cost,i+2,end) + cost [i] ;
        int skip  = solve (cost, i+1,end);

        return Math.max(rob, skip);
    }
    
}
