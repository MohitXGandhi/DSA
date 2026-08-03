import java.util.*;
public class FibonacciTabulation {
    
    public int fibonacci(int n){
        /*
        base case
        create dp array
        initialize dp0 and dp1
        loop
        return ans
         */

    //base case
    if( n == 0) return 0;
    if( n == 1) return 1;

    //creating dp array
    int[] dp = new int[n+1];
    // initializing
    dp[0]=0;
    dp[1]=1;

    //loop
    for(int i = 2; i<=n; i++){
        dp[i]= dp[i-1]+ dp[i-2];
       
        
    }

    //return
    return dp[n];


    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter integer:");
        int n = sc.nextInt();

        FibonacciTabulation obj = new FibonacciTabulation();
        System.out.println("Tabulation rsult = " + obj.fibonacci(n));

    }
    
}
