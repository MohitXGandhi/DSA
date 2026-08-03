import java.util.*;
public class memoization {
    /*base case
     already sorted?
     recurrence 
     store in dp[]
     return */

    public int solve(int i , int j ,int[][] grid, int [][] dp){
        int m = grid.length;
        int n = grid[0].length;
        //base case
        if( i == m-1 && j== n-1) return 1;
        if(i >= m || j>=n ) return 0;

        //already in dp[]
        if(dp[i][j] != -1) return dp[i][j];

        //recursion 
        int right = solve(i,j+1,grid,dp);
        int down = solve(i+1,j,grid,dp);

        //store
        dp[i][j] = right + down;

        return dp[i][j];

    }
    public int uniquePath (int[][] grid ){
        int m  = grid.length; //rows
        int n = grid[0].length; // columns
         //creating do table;
        int[][] dp = new int[m][n];
        //array fill 
        for(int i =0 ; i < m; i++){
            Arrays.fill(dp[i], -1);
        }
         
       
        //initial call
        return solve(0,0,grid,dp);
    }
    
}
/* complexities = time = O(n)
 space = O(m+n))                wRONGGGGGGGG
 

Time Complexity

How many DP states are there?

m × n

Each state is solved only once.

At each state, we do constant work (2 recursive calls/checks).

So,

✅ Time = O(m × n)

Space Complexity

Two things consume memory:

DP Table
m × n

↓

O(m × n)

Recursion Stack

Maximum path length:

(m-1) downs + (n-1) rights

↓

O(m + n)

Final Answer (Write in Notebook)

Memoization

Time: O(m × n)
Space: O(m × n) + O(m + n)

where:

O(m × n) → DP table
O(m + n) → Recursion stack */