import java.util.*;
class max1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		//int num=(a>b&&a>c?(a>d&&a>e?a:(b>c&&b>d?(b>e?b:(c>d&&c>e?c:e)))));
		//int num1=(num>c?num:c);
		int num=a>b&&a>c&&a>d&&a>e?a:(b>c&&b>d&&b>e?b:(c>d&&c>e?c:(d>e?d:e)));
		System.out.println("max num is: "+num);
	}
}
