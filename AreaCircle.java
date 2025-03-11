import java.util.*;
class AreaCircle
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radius");
		int r=sc.nextInt();
		double area=(3.14*r*r);
		System.out.println("Area of circle is: "+area);
	}
}