import java.util.*;
public class p4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number=");
    int n = sc.nextInt();
    int factorial = 1;

    while(n>0){
      

        //factorial check
        
        factorial *= n ;
        n--;

    }
    System.out.println(factorial);
    }

}
