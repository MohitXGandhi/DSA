
public class recursion {
    public int solve(int i, int j, int[][] grid){
        int m = grid.length;       // rows
        int n = grid[0].length;    // columns
        //base case
        //Reaching to the destination
        if( i == m-1 && j == n-1) return 1;
        //reaching outside the grid;
        if( i >= m || j>=n) return 0;

        //recursion case - function call
        int right = solve(i, j+1,grid);
        int down  = solve (i+1, j,grid);

        //return current
        return right + down;

        //but solve function do not know any grid hence
    }
    public int uniquePaths(int m, int n ){
        int[][] grid = new int[m][n];
        return solve(0,0,grid);
        }
}
/* space complexity = O(m+n);
   time complexity =  2^ m+n; 
   
   dp table and already cehck?
   base case mai b dp ka element*/

   