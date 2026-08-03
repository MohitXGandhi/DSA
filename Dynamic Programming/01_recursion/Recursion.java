import java.util.Scanner;

public class Recursion {
    //1. Factorial
    public int factorial(int n){
        //3steps
        //base case {what is the smallest problem}
        if(n == 0) return 1;
        if(n == 1) return 1;
        
        //current problem{how can we reduce current problem}
        int smallAnswer = factorial(n-1);

        //current answer 
        return n* smallAnswer;
    }
    public int sum(int n ){
        //2.sum of N numbers using recursion
        // base case
        if(n == 0 ) return 0;
        if(n == 1) return 1;

        //current 
        int sumAnswer = sum (n-1);

        // current answer ;
        return n+ sumAnswer;
    }
    
    public void print (int n )//int ka mtlb return krega no return no int 
    {
        //base case
        if(n==0) return ; //only stopping recursion not returning any value
        // current reducing
        print(n-1);

        //current ans
        System.out.println(n);


    }
    public void printReverse(int n){
        //base case
        if( n == 0 ) return ;

        //current answer
        System.out.println(n);

        //reducing
        printReverse(n-1);
    }





    public static void main(String[] args){
   Scanner sc = new Scanner (System.in); 
   System.out.println("Enter integer- ");
   int n = sc.nextInt();
   //non static method ko call krre h toh we will make an object
   //class = Recursion, hence
   Recursion obj  = new Recursion();
   System.out.println("Factorial = " + obj.factorial(n)); //method call obj.factorial(n)
   System.out.println("Sum = " + obj.sum(n));
   System.out.println("print 1to N = ");
   obj.print(n);
   System.out.println("Reverse print = ");
   obj.printReverse(n);
   }
    
}
