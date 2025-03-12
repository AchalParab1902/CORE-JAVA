import java.util.*;
public class fibonacii{
    public static void fibo(int num,int first,int second){
        System.out.print(first+" ");
        if(num==1){
            return;
        }
        fibo(--num,second,first+second);
       
    }
       
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        fibo(num,0,1);
       
}
}