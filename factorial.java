//WAP to print factorial using recursion
import java.util.*;
public class factorial{
    public static int numOfFacto(int facto,int num){
        
        if(num>0){
        facto=facto*num;
        
        num--; 
       facto=numOfFacto(facto,num); 
        }

    
        return facto;  
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int facto=1;
       int a= numOfFacto(facto,num);
       System.out.println("Factorial of  given number is : "+a);
}
}