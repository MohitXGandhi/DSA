import java.util.*;
public class FibonacciSpaceOptimization {
    
    public int SpaceOptimization(int n ){
        /*
        base case
        Loop
        shift variables
        return */
        
        //base case:
        if( n== 0) return 0;
        if(n== 1) return 1;
        int prev1= 1; //because fib[1] = 1
        int prev2 = 0;//fib[0] = 0;

        //Loop
        for(int i = 2; i<= n; i++){
            int curr = prev1 + prev2 ;

            //shift variables;
            prev2 = prev1;
            prev1 = curr;


        }
        
         
        
        //return 
        return prev1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n =");
        int n = sc.nextInt();

        FibonacciSpaceOptimization obj = new FibonacciSpaceOptimization();
        System.out.println("Optimized result =" + obj.SpaceOptimization(n));
    }
}
