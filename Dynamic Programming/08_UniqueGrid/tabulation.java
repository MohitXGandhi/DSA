
public class tabulation {
    /*
    dp array
    base case or
    initialization
    loop
    return 
    solve -- dp[]
    recurence htao*/

    public int uniquePath(int[][] grid ){
        int m = grid.length ;
        int n = grid[0].length;
       

       
        // dp table
        int[][] dp = new int[m][n];

        //base case
        dp[m-1][n-1] = 1;

        // as our answer depends on i+1 and j+! hence we will be starting a reverse loop
        for(int i = m-1; i >=0 ; i-- ){ 
            for(int j = n-1; j>=0; j--){ 
                //skip destination
                if(i==m-1 && j == n-1)
                    continue;
                int right = 0 ;
                int down = 0;
                if(j+1 < n){
                    right = dp[i][ j+1];

                }
                if( i+1 < m ){
                    down = dp [i+1][ j];
                    

                }
                dp[i][j] = right + down;
                                
            }
        }
        return dp[0][0];

        
    }
}    

