

public class memoization {
    public int climb(int n, int[] dp){
       /*
       1.base cases
       2.already solved?
       3.recusrive calls
       4.store ans
       5. return  */ // memoization steps
       //base case
       if(n == 0) return 1; // 1 way hoga on top pr
       if( n==1) return 1; // 1 way

       // already solved?
       if(dp[n] != -1){
        return dp[n];
       }
       // recursive calls;
       int oneStep = climb( n-1 , dp);
       int twoStep = climb (n-2, dp);

       //store ans;
       dp[n] = oneStep + twoStep ;

       //return ans;
       return dp[n];
    
    
    }
    //time - O(n); // solving n times not into branches
    //space - O(n); // depth n tk jare
    /*The interview explanation would be:

Time: O(n)

Each state (0...n) is solved only once because after it is computed, it is stored in dp[].

Space: O(n)
O(n) for the dp array.
O(n) recursion stack.

Technically, total auxiliary space is O(n) + O(n) = O(n) */
}
