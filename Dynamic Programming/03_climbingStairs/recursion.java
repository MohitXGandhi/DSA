import java.util.*;
public class recursion {
    public int recursion(int n ){
        //in recursion 3 steps
        /* 
        base case 
        recursive calls
        current return
         */
        //base case
        if( n == 0) return 1; // on top hai toh 1 way
        if( n == 1) return 1; // 1 way

        //recursive calls
        int oneStep = recursion(n-1); // Function call
        int twoStep = recursion(n-2);//Function call

        //current answer
        return oneStep + twoStep;
    
    }
    /*
    time - O (2^n)  // bacause each function calls branches into two 
    more recursive calls. jaise ways 5 - ways 4 and 3 then ways 4 goes for 
    ways 3 and 2
    ways(5)
├── ways(4)
│   ├── ways(3)
│   └── ways(2)
└── ways(3)
    ├── ways(2)
    └── ways(1) 


    space - O(n) maximum depth = n 
    ways(5)
→ ways(4)
→ ways(3)
→ ways(2)
→ ways(1)
     */
    
}
