//WAP to print factorial using recursion
import java.util.*;
public class factorial{
    public static int numOfFacto(int num){
        
        if(num==1){
         return 1;
        }
       return num*numOfFacto(--num);
    }
       
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int facto=1;
       int a= numOfFacto(num);
       System.out.println("Factorial of  given number is : "+a);
}
}