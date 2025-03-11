import java.util.*;
class midvalue
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int num=a<b&&b<c?b:(a>b&&b<c?c:(a>b&&b<c?a:a));
		//int num1=(num>c?num:c);
		//int num2=(a>b&&b>c?b:(c>b&&b>a?b: (a<b&&b>c?c:(a>b&&c>b?c:a>b&&b<c?a:a<b&&b>c?a:a) )));
		
		int num2=(((a<b&&b>c&&a<c)||(a>b&&b<c&&a>c))? c : ((a<b&&b>c&&a>c)||(a>b&&b<c&&a<c))?a:b);		
		System.out.println("mid num is: "+num2);
	}
}



 
 