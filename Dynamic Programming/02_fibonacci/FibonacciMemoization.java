import java.util.*;
public class FibonacciMemoization {
    /*
    order to follow for memoization:
    1. base case
    2.Already solved?
    3.Recursive calls
    4.Store ans 
    5. return ans
    */

    public int fibonacci(int n , int[] dp){
        //base case
        if( n == 0 ) return 0;
        if( n == 1 ) return 1;

        //already solved?
        if( dp[n] != -1){
            return dp[n];
        }

        //recursive calls
        int left = fibonacci(n-1, dp);
        int right = fibonacci(n-2, dp );

        //store value;
        dp[n] = left + right;

        //return 
        return dp[n] ; 

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer :");
        int n = sc.nextInt();
        //ceating dp array
        int [] dp = new int[n+1];
        //filling -1;
        Arrays.fill(dp,-1);
        
        FibonacciMemoization obj = new FibonacciMemoization();
        System.out.println("Fibonacci result =" + obj.fibonacci(n, dp));
        sc.close();
        }
    

    
}
