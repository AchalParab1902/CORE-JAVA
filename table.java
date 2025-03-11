//WAP to print table of user given number using recursion
import java.util.*;
public class table{
    public static void numOfTable(int num,int n){
        if(n==11){
            return;
        }
         System.out.println(num*n);
         n++;
        numOfTable(num,n);
       
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int n=1;
        numOfTable(num,n);
}
}