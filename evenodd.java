import java.util.*;
class evenodd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//int b=sc.nextInt();
		String num=(a%2==0?"Even":"odd");
		
	
		System.out.println("num is: "+num);
	}
}
