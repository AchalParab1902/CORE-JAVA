import java.util.*;
class Cube 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int cube=num*num*num;
		System.out.println("Cube is : "+cube);
	}
}
