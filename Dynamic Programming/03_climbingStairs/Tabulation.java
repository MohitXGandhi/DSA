

public class Tabulation {
    public int climb(int n){
        /*
    base case
    create dp[]
    initialize
    loop
    return */
    //base case
    if(n == 0 ) return 1;
    if( n == 1) return 1;

    //create dp[]
    int[] dp = new int[n+1];

    //initialize
    dp[0 ] = 1;
    dp[1] = 1;

    //Loop
    for(int i = 2; i<= n ; i++){
        dp[i] = dp[i-1] + dp[i-2];

    }
    //return 
    return dp[n];
 
    }
    

}
