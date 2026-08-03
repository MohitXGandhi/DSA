
public class SpaceOptimization {
    public int climb(int n ){
        /*
        steps are:
        1.base case
        2. Loop;
        shift variable
        4. return  */
        //base cases
        if(n == 0) return 1;
        if( n == 1) return 1;
        int prev1 = 1;
        int prev2 = 1;

        //Loop
        for(int i = 2 ; i<= n ; i++){
            int curr = prev1 + prev2 ;
            //variable shift;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
        /*
        complexities;
        time = O(n) // loop n times
        space = O(1) // only 3 variables no array */


    }
    
}
