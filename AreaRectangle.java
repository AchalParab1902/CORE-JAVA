import java.util.*;
class AreaRectangle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Length");
		int length=sc.nextInt();
		System.out.println("Enter a bredth");
		int breadth=sc.nextInt();
		
		int area=length*breadth;
		System.out.println("Area of reactangle is : "+area);
		
	}
}
