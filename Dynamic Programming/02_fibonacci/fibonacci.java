import java.util.*;
public class fibonacci { //class name capital Fibonacci
    public int fibonacci(int n){
        //base case
        if(n == 0) return 0; 
        if(n == 1) return 1;

        //current reduce
        int left = fibonacci(n-1);
        int right = fibonacci (n-2);

        //current answer
        return left + right;

        

    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in); //input point
        System.out.println("Enter number : ");

        int n = sc.nextInt();
        fibonacci obj = new fibonacci();
        System.out.println(obj.fibonacci(n));
    }
    
    
}
